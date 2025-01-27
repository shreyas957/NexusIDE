package com.nexuside.core;

import com.nexuside.utils.LogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Configuration
public class ApplicationDatabase {
    @Value("${app.database.filename:nexusIDE.db}")
    private String databaseFilename;

    @Bean
    public DataSource dataSource() {
        String userHome = System.getProperty("user.home");
        String dbPath = userHome + "/.nexusIDE";
        try {
            Files.createDirectories(Path.of(dbPath));
        } catch (IOException e) {
            LogUtil.error(ApplicationDatabase.class, "Failed to create database directory", e);
            throw new RuntimeException(e);
        }
        dbPath = dbPath + "/" + databaseFilename;
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:" + dbPath);
        dataSource.setDatabaseName("nexusIDE");
        return dataSource;
    }
}

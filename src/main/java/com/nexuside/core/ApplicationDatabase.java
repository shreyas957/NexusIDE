package com.nexuside.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Configuration
public class ApplicationDatabase {
    @Value("${app.database.filename:nexusIDE.db}")
    private String databaseFilename;

    @Bean
    public DataSource dataSource() {
        String userHome = System.getProperty("user.home");
        String dbPath = userHome + "/" + databaseFilename;
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:" + dbPath);
        dataSource.setDatabaseName("nexusIDE");
        return dataSource;
    }
}

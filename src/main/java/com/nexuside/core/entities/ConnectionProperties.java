package com.nexuside.core.entities;

public interface ConnectionProperties {
    Integer getId();

    void setId(Integer id);

    String getHostName();

    void setHostName(String hostName);

    String getPort();

    void setPort(String port);

    String getUserName();

    void setUserName(String userName);

    String getPassword();

    void setPassword(String password);

    String getDatabaseName();

    void setDatabaseName(String databaseName);
}

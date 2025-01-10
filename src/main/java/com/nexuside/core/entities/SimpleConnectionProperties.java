package com.nexuside.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "connection_properties")
public class SimpleConnectionProperties implements ConnectionProperties, Serializable {
    @Serial
    private static final long serialVersionUID = 4112578638593542748L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "host_name")
    private String hostName;
    @Column(name = "port")
    private String port;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "database_name")
    private String databaseName;

    public SimpleConnectionProperties() {
    }

    public SimpleConnectionProperties(String hostName, String port, String userName, String password, String databaseName) {
        this.hostName = hostName;
        this.port = port;
        this.userName = userName;
        this.password = password;
        this.databaseName = databaseName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String toString() {
        return "SimpleConnectionProperties{" +
                "id=" + id +
                ", hostName='" + hostName + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", databaseName='" + databaseName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SimpleConnectionProperties that = (SimpleConnectionProperties) o;
        return Objects.equals(id, that.id) && Objects.equals(hostName, that.hostName) && Objects.equals(port, that.port) && Objects.equals(userName, that.userName) && Objects.equals(databaseName, that.databaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hostName, port, userName, databaseName);
    }
}

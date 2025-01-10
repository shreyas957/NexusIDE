package com.nexuside.core.daoservice;

import com.nexuside.core.entities.ConnectionProperties;
import com.nexuside.core.entities.SimpleConnectionProperties;

import java.util.List;
import java.util.Optional;

public interface SimpleConnectionPropertiesDao {
    List<SimpleConnectionProperties> getAllConnectionProperties();

    Optional<SimpleConnectionProperties> getConnectionPropertiesById(int id);

    void insertConnectionProperties(ConnectionProperties connectionProperties);

    void removeConnectionProperties(int id);

    void updateConnectionProperties(ConnectionProperties connectionProperties);

    Optional<SimpleConnectionProperties> getConnectionPropertiesByName(String name);

}

package com.nexuside.core.daoservice;

import com.nexuside.core.entities.ConnectionProperties;
import com.nexuside.core.entities.SimpleConnectionProperties;
import com.nexuside.core.repositories.SimpleConnectionPropertiesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("jpaDaoService")
public class SimpleSimpleConnectionPropertiesJpaDaoService implements SimpleConnectionPropertiesDao {
    private final SimpleConnectionPropertiesRepository simpleConnectionPropertiesRepository;

    public SimpleSimpleConnectionPropertiesJpaDaoService(SimpleConnectionPropertiesRepository simpleConnectionPropertiesRepository) {
        this.simpleConnectionPropertiesRepository = simpleConnectionPropertiesRepository;
    }

    @Override
    public List<SimpleConnectionProperties> getAllConnectionProperties() {
        return simpleConnectionPropertiesRepository.findAll();
    }

    @Override
    public Optional<SimpleConnectionProperties> getConnectionPropertiesById(int id) {
        return Optional.empty();
    }

    @Override
    public void insertConnectionProperties(ConnectionProperties connectionProperties) {

    }

    @Override
    public void removeConnectionProperties(int id) {

    }

    @Override
    public void updateConnectionProperties(ConnectionProperties connectionProperties) {

    }

    @Override
    public Optional<SimpleConnectionProperties> getConnectionPropertiesByName(String name) {
        return Optional.empty();
    }
}

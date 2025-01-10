package com.nexuside.core.service;

import com.nexuside.core.daoservice.SimpleConnectionPropertiesDao;
import com.nexuside.core.dtos.SimpleConnectionPropertiesDto;
import com.nexuside.core.dtos.SimpleConnectionPropertiesDtoMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleConnectionPropertiesService {
    private final SimpleConnectionPropertiesDao simpleConnectionPropertiesDao;
    private final SimpleConnectionPropertiesDtoMapper simpleConnectionPropertiesDtoMapper;

    public SimpleConnectionPropertiesService(@Qualifier("jpaDaoService") SimpleConnectionPropertiesDao simpleConnectionPropertiesDao, SimpleConnectionPropertiesDtoMapper simpleConnectionPropertiesDtoMapper) {
        this.simpleConnectionPropertiesDao = simpleConnectionPropertiesDao;
        this.simpleConnectionPropertiesDtoMapper = simpleConnectionPropertiesDtoMapper;
    }

    public List<SimpleConnectionPropertiesDto> getSimpleConnectionProperties() {
        return simpleConnectionPropertiesDao.getAllConnectionProperties().stream()
                .map(simpleConnectionPropertiesDtoMapper)
                .toList();
    }
}

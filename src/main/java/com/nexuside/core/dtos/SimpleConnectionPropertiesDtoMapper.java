package com.nexuside.core.dtos;

import com.nexuside.core.entities.SimpleConnectionProperties;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SimpleConnectionPropertiesDtoMapper implements Function<SimpleConnectionProperties, SimpleConnectionPropertiesDto> {

    @Override
    public SimpleConnectionPropertiesDto apply(SimpleConnectionProperties simpleConnectionProperties) {
        return new SimpleConnectionPropertiesDto(simpleConnectionProperties.getHostName(),
                simpleConnectionProperties.getPort(),
                simpleConnectionProperties.getUserName(),
                simpleConnectionProperties.getDatabaseName());
    }
}

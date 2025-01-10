package com.nexuside.core.controllers;

import com.nexuside.core.dtos.SimpleConnectionPropertiesDto;
import com.nexuside.core.service.SimpleConnectionPropertiesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/simple-connection-properties")
public class SimpleConnectionPropertiesController {
    private final SimpleConnectionPropertiesService simpleConnectionPropertiesService;

    public SimpleConnectionPropertiesController(SimpleConnectionPropertiesService simpleConnectionPropertiesService) {
        this.simpleConnectionPropertiesService = simpleConnectionPropertiesService;
    }

    @GetMapping
    public List<SimpleConnectionPropertiesDto> getSimpleConnectionProperties() {
        return simpleConnectionPropertiesService.getSimpleConnectionProperties();
    }
}

package com.nexuside.core.dtos;

import java.util.Objects;

public record SimpleConnectionPropertiesDto(String hostName, String port, String userName,
                                            String databaseName) {
    public SimpleConnectionPropertiesDto {
        Objects.requireNonNull(hostName, "hostName must not be null");
        Objects.requireNonNull(port, "port must not be null");
        Objects.requireNonNull(userName, "userName must not be null");
        Objects.requireNonNull(databaseName, "databaseName must not be null");
    }
}

package com.mydoctor.appointments.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "hikarids")
public class DataSourceProperties {

    private String jdbcUrl;
    private String username;
    private String password;
    private int connectionTimeout;
    private int maxPoolSize;
}
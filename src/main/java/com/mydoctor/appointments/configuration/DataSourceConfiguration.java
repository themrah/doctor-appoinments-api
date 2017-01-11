package com.mydoctor.appointments.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Bean
    public HikariDataSource dataSource() {

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(dataSourceProperties.getJdbcUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        dataSource.setConnectionTimeout(dataSourceProperties.getConnectionTimeout());
        dataSource.setMaximumPoolSize(dataSourceProperties.getMaxPoolSize());

        return dataSource;
    }
}


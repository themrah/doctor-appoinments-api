package com.mydoctor.appointments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by emrah.bektas on 02/05/16.
 */
@SpringBootApplication
@EnableConfigurationProperties
public class ArrangementApplication {

    public static void main(String[] args){
        SpringApplication.run(ArrangementApplication.class, args);
    }
}

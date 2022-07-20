package com.nafapap.ekclient02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ekclient01Application {

    public static void main(String[] args) {
        SpringApplication.run(Ekclient01Application.class, args);
    }

}

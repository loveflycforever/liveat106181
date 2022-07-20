package com.nafapap.ekservery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EkserverxApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkserveryApplication.class, args);
    }

}

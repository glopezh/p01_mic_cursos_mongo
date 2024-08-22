package com.cjava.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class P01MicCursosMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(P01MicCursosMongoApplication.class, args);
    }

}

package com.github.fabriciolfj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.github.fabriciolfj"})
public class ClientExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientExampleApplication.class, args);
    }

}
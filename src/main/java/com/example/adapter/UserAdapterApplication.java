package com.example.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserAdapterApplication.class, args);
    }

}

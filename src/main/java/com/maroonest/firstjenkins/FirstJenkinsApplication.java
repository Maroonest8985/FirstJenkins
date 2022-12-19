package com.maroonest.firstjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FirstJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstJenkinsApplication.class, args);
    }

}

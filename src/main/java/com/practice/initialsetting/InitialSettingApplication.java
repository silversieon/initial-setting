package com.practice.initialsetting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InitialSettingApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitialSettingApplication.class, args);
    }

}

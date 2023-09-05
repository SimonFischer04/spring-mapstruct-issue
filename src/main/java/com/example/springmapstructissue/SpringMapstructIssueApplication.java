package com.example.springmapstructissue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;

@SpringBootApplication
public class SpringMapstructIssueApplication {
    @Autowired
    ConversionService conversionService;

    public static void main(String[] args) {
        SpringApplication.run(SpringMapstructIssueApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println(conversionService.convert(new ExampleDTO("Test"), Example.class));
        };
    }


}

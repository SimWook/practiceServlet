package com.servlet.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletPracticeApplication.class, args);
    }

    /*@Bean
    ViewResolver internalResourceViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }*/
}

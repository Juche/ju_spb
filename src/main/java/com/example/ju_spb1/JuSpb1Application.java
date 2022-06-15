package com.example.ju_spb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JuSpb1Application {

    @RequestMapping("/")
    String home() {
        return "Hello Juching!";
    }

    public static void main(String[] args) {
        SpringApplication.run(JuSpb1Application.class, args);
    }

}

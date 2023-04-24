package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
    
    @GetMapping("/home")
    public void init()
    {
        Logger log = LoggerFactory.getLogger(App.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
}

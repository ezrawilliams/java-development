package com.pluralsight.springbeandemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Application implements CommandLineRunner {
    @Autowired
    private String name;
    @Override
    public void run(String... args) throws Exception {
        //Application logic goes here
    }
}

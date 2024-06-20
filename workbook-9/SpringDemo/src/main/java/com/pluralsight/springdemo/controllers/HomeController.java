package com.pluralsight.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
This class will include various HANDLER methods that dictate
what happens when we go into our URL PATHS
 */
@RestController
public class HomeController {

    //This handler method will respond to http://localhost:8080/
    @RequestMapping(path="/", method= RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "World") String country ){
        return "Hello "+country+ "!";
    }
}

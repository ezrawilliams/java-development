package com.pluralsight.service;

import com.pluralsight.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean ("candy")
    public Product candy(){
        return new Product(55,"Milka Alpen Milch", "Candy",2.5);
    }

    @Bean ("drink")
    public Product drink(){
        return new Product(56, "Coke Zero", "Beverages", 1.50);
    }
}


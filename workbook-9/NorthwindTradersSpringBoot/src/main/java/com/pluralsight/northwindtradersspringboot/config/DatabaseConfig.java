package com.pluralsight.northwindtradersspringboot.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    private BasicDataSource basicDataSource;

    @Autowired
    public DatabaseConfig(@Value("${spring.datasource.url}") String url,
                          @Value("${spring.datasource.username}") String username
                         // @Value("{spring.datasource.password}") String password
                          ){
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword("password");
        // print the values to the screen just to verify it worked
        System.out.println(url + " : " + username + " : ");
    }

    @Bean
    public BasicDataSource dataSource(){
        return basicDataSource;
    }
}

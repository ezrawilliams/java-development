package com.pluralsight.northwindtradersspringboot.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("classpath:database.dev.properties")
public class DatabaseConfigDev {
    private BasicDataSource basicDataSource;

    @Autowired
    public DatabaseConfigDev(@Value("${connectionUrl}") String url,
                          @Value("${username}") String username,
                          @Value("{password}") String password
    ){
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        // print the values to the screen just to verify it worked
        System.out.println(url + " : " + username + " : "+password);
    }

}

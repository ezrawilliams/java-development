package com.pluralsight.springdemo.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfiguration {

    private BasicDataSource basicDataSource;

    @Bean
    public BasicDataSource dataSource(){
        return basicDataSource;
    }

    public DbConfiguration(@Value("${spring.datasource.url}") String url,
                           @Value("${spring.datasource.username}") String username
            //,                          @Value("${datasource.password}") String password
                           ) {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword("password");
    }
}


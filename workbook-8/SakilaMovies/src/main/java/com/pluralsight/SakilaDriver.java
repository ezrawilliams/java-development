package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class SakilaDriver {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        //Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3307/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        SakilaDataManager dataManager = new SakilaDataManager(dataSource);
        List<Actor> actorList = dataManager.actorLastName();
        System.out.println(actorList);
        actorList.forEach(System.out::println);

        List<Film> movies = dataManager.actorMovies();
        movies.forEach(System.out::println);
    }
}

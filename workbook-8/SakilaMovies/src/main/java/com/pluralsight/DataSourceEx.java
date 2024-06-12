package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataSourceEx {
    public static void main(String[] args) {
        //Create the datasource
        BasicDataSource dataSource = new BasicDataSource();

        //Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3307/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        actorLastName(dataSource);
    }

    public static void actorLastName(BasicDataSource dataSource){
        Scanner scanner = new Scanner(System.in);
        String lastName;
        System.out.println("Please enter the last name of an actor you like");
        lastName=scanner.nextLine();

        String query = "SELECT first_name, last_name FROM actor WHERE last_name "
                +"= ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     (query);){
            preparedStatement.setString(1, lastName);

            //execute the query:
            try (ResultSet resultSet = preparedStatement.executeQuery()){
                //Process the results:
                if (resultSet.next()){
                    do {
                        System.out.println(resultSet.getString(1)+" "+
                                resultSet.getString(2));
                    } while (resultSet.next());
                } else {
                    System.out.println("This actor does not exist in our database!");
                }
                actorMovies(dataSource);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void actorMovies(BasicDataSource dataSource){
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("Please enter the first and last name of an actor you like");
        scanner.useDelimiter("[\\s,]+");
        firstName = scanner.next();
        lastName = scanner.next();

        String query = "SELECT film.title FROM film join film_actor ON film.film_id = "
        +" film_actor.film_id join actor ON film_actor.actor_id = actor.actor_id "+
                " WHERE first_name = ? AND last_name = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     (query);){
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);

            //execute the query:
            try (ResultSet resultSet = preparedStatement.executeQuery()){
                if (resultSet.next()){
                    do {
                        System.out.println(resultSet.getString(1)+" "+
                                resultSet.getString(2));
                    } while (resultSet.next());
                } else {
                    System.out.println("This actor does not exist in our database!");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

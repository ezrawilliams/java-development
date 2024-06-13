package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.Scanner;

public class DataSourceEx {
    public static void main(String[] args) {
        //Create the datasource
        BasicDataSource dataSource = new BasicDataSource();

        //Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3307/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        //actorLastName(dataSource);
        //insertIntoDirect(dataSource);
        //insertIntoWithGeneratredKeys(dataSource);
        //updateRecord(dataSource);
        //deleteRecord(dataSource);
        createTable(dataSource);
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

    public static void insertIntoDirect(BasicDataSource dataSource){
        try (Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " +
                "country (country) VALUES (?);");){
            //set the parameter:
            preparedStatement.setString(1, "Eritrea");
            //exectute the query
            int rows = preparedStatement.executeUpdate(); //returns number of rows affected
            //confirm the update
            System.out.printf("Rows updated %d\n", rows);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertIntoWithGeneratredKeys(BasicDataSource dataSource){
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " +
                "country (country) values (?);", Statement.RETURN_GENERATED_KEYS);){
            preparedStatement.setString(1, "Mongolia");
            int rows = preparedStatement.executeUpdate();
            System.out.printf("Rows updated %d\n", rows);

            try (ResultSet keys = preparedStatement.getGeneratedKeys()){
                while (keys.next()){
                    System.out.printf("%d key was added\n", keys.getLong(1));
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateRecord(BasicDataSource dataSource){
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("UPDATE film_text SET description = ? WHERE film_id = ?");){
            preparedStatement.setString(1, "Apache Devine is an Apache Project that " +
                    "delivers messages to different brokers without care as to what technology it is");
            preparedStatement.setLong(2, 31);

            int rows = preparedStatement.executeUpdate();

            System.out.printf("Rows udated %d\n", rows);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteRecord(BasicDataSource dataSource){
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("DELETE FROM country WHERE country = ?");){
            preparedStatement.setString(1, "Mongolia");

            int rows = preparedStatement.executeUpdate();

            System.out.printf("Rows deleted %d\n", rows);

        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void createTable(BasicDataSource dataSource) {
        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement( "CREATE TABLE film_reviews " +
                             "(" + "movie_review_id bigint primary key, " +
                             "news_source varchar(500) not null, " +
                             "stars int not null, " + "reviewer varchar(200), " +
                             "film_id smallint unsigned not null, " +
                             "FOREIGN KEY (film_id) REFERENCES " +
                             "film(film_id)) ENGINE=INNODB;"); ) {
            // execute the prepared statement
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SakilaDataManager {
    private BasicDataSource dataSource;

    public SakilaDataManager(BasicDataSource dataSource){
        this.dataSource=dataSource;
    }

    public List<Actor> actorLastName(){
        List<Actor> actors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String lastName;
        System.out.println("Please enter the last name of an actor you like");
        lastName=scanner.nextLine();

        String query = "SELECT actor_id, first_name, last_name FROM actor WHERE last_name "
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
                      //  System.out.println("IT GOES HERE!");
                        int id = resultSet.getInt("actor_id");
                        String name = resultSet.getString("first_name");
                        String lName = resultSet.getString("last_name");

                        //Create the actor object:
                        Actor actor = new Actor(id, name, lName);
                        actors.add(actor);
                       // System.out.println(actor);
                      //  System.out.println(actors);
                    } while (resultSet.next());
                } else {
                    System.out.println("This actor does not exist in our database!");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return actors;
    }

    public List<Film> actorMovies(){
        List<Film> films = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("Please enter the first and last name of an actor you like");
        scanner.useDelimiter("[\\s,]+");
        firstName = scanner.next();
        lastName = scanner.next();

        String query = "SELECT film.film_id, film.title, film.description, film.release_year, film.length" +
                " FROM film join film_actor ON film.film_id = "
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
                       int id = resultSet.getInt("film_id");
                       String title = resultSet.getString("title");
                       String description = resultSet.getString("description");
                       String releaseYear = resultSet.getString("release_year");
                       int length = resultSet.getInt("length");
                       Film film = new Film(id, title,description,releaseYear,length);
                       films.add(film);
                    } while (resultSet.next());
                } else {
                    System.out.println("This actor does not exist in our database!");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return films;
    }
}

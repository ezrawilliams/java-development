package com.pluralsight;


import java.sql.*;

public class App {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load the MySQL Driver:
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Open a connection to the database:
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:" +
                "3307/sakila", "root","password");
        //create the statement that is tied to the connection:
        Statement statement = connection.createStatement();

        //define the query that we want to execute:
        String query = "SELECT first_name FROM actor WHERE " +
                "first_name LIKE 'A%'";

        //Execute query:
        ResultSet results = statement.executeQuery(query);

        //Process my results:
        while(results.next()){
            String name = results.getString("first_name");
            System.out.println(name);
        }
        //Close the connection:
        connection.close();
    }


}

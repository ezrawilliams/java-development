package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class UsingDataSource {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println( "Application needs two arguments to run: " +
                    "java com.hca.jdbc.UsingDriverManager <username> " +
                    "<password>"); System.exit(1);
        }

        // get the username and password from the command line args
        String username = args[0];
        String password = args[1];

        //Create the datasource
        BasicDataSource dataSource = new BasicDataSource();

        //Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3307/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        //Interact with the database:
       // doSimpleQuery(dataSource);
        doJoin(dataSource);
    }

    private static void doSimpleQuery (BasicDataSource dataSource) {
        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement( "SELECT first_name, " +
                             "last_name FROM customer " +
                             "WHERE last_name LIKE ? ORDER BY first_name"); ) {
            // Set any required parameters
            preparedStatement.setString(1, "Sa%");

            // Execute the query
            try (ResultSet resultSet = preparedStatement.executeQuery() )
            {
                // Process the results
                while (resultSet.next()) {
                    System.out.printf( "first_name = %s, last_name = %s;\n",
                            resultSet.getString(1),
                            resultSet.getString(2));
                }
            }
        } catch (SQLException e) {
            // This will catch all SQLExceptions occurring
            // in the try block, including those in nested
            // try statements
            e.printStackTrace();
        }
    }

    private static void doJoin(BasicDataSource dataSource){
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT customer.first_name, customer.last_name, " +
                             "address.address, city.city, country.country " +
                             "FROM customer " + "LEFT JOIN address " + " " +
                             "ON (customer.address_id = address.address_id) " +
                             "LEFT JOIN city " + " ON (address.city_id = city.city_id) " +
                             "LEFT JOIN country " + " ON (city.country_id = country.country_id) " +
                             "WHERE last_name LIKE 'Ma%' " + "ORDER BY customer.first_name;"); )

        { try (ResultSet resultSet = preparedStatement.executeQuery() ) {
            while (resultSet.next()) {
                System.out.printf( "first_name = %s, last_name = %s, address = %s,"
                        + " city = %s, country = %s\n",
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5));
            }
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.Scanner;

public class NorthwindMain2 {
    public static void main(String[] args) {
        //Create the datasource
        BasicDataSource dataSource = new BasicDataSource();
        try {
            //Configure the datasource
            dataSource.setUrl("jdbc:mysql://localhost:3307/northwind");
            dataSource.setUsername("root");
            dataSource.setPassword("password");

            /*Home screen:
            Scanner input = new Scanner(System.in);
            int option;
            System.out.println("What do you want to do? \n\t 1) Display all products" +
                    "\n\t 2) Display all customers \n\t 3) Display all categories \n\t" +
                    " 0) Exit \n Select an option: ");
            option = input.nextInt();

            if (option == 1) {
                displayAllProducts(dataSource);
            } else if (option == 2) {
                displayAllCustomers(dataSource);
            } else if (option == 3){
                displayAllCategories(dataSource);
            }
            else if (option == 0) {
                System.exit(0);
            }*/
            //Create a connection
            Connection conn = dataSource.getConnection();

            // create the query, but surround it with { } and // use a ? for parameters
            String query = "{CALL CustOrderHist(?)}";
            // Create the CallableStatement
            CallableStatement stmt = conn.prepareCall(query);
            // Set any parameters
            stmt.setString(1, "EASTC");
            // Execute the query
            ResultSet resultSet = stmt.executeQuery();
            // Process the returned values
            while (resultSet.next()) {
                System.out.printf("%s - %d\n",
                        resultSet.getString("ProductName"),
                        resultSet.getInt("TOTAL")); }
        } catch (SQLException s){
            s.printStackTrace();
        }

    }

    private static void displayPerCategory(BasicDataSource dataSource){
        Scanner scanner = new Scanner(System.in);
        int categoryId;
        System.out.println("Please enter a category id to see the products in that category ");
        categoryId= scanner.nextInt();
        String query = "SELECT productid, productname, unitprice, unitsinstock  FROM products " +
                "WHERE categoryId = ?";

        try (Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1, categoryId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" +
                            resultSet.getString(2) + "\t" +
                            resultSet.getDouble(3) + "\t" +
                            resultSet.getInt(4));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    private static void displayAllCategories(BasicDataSource dataSource) {
        String query = "SELECT categoryid, categoryname FROM categories ORDER BY categoryid ";
        try (
                Connection connection = dataSource.getConnection();PreparedStatement statement = connection.prepareStatement(query);){
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" +
                            resultSet.getString(2));
                }
            }
            displayPerCategory(dataSource);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void displayAllCustomers(BasicDataSource dataSource) throws SQLException {
        String query = "SELECT contactname, companyname, city, country, phone  FROM customers" +
                " ORDER BY country";
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+"\t"+
                        resultSet.getString(2)+"\t"+
                        resultSet.getString(3)+"\t"+
                        resultSet.getString(4)+"\t"+
                        resultSet.getString(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (resultSet!=null)
                try{
                    resultSet.close();
                } catch (SQLException s){
                    s.printStackTrace();
                }

            if (statement!=null)
                try {
                    statement.close();
                } catch (SQLException s){
                    s.printStackTrace();
                }
        }
    }


    private static void displayAllProducts(BasicDataSource dataSource) throws SQLException{
        String query = "SELECT productid, productname, unitprice, unitsinstock  FROM products";
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+"\t"+
                        resultSet.getString(2)+"\t"+
                        resultSet.getDouble(3)+"\t"+
                        resultSet.getInt(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (resultSet!=null) resultSet.close();
            if (statement!=null) statement.close();
        }
    }
}

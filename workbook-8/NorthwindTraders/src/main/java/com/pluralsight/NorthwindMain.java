package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class NorthwindMain {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost" +
                    ":3307/northwind", "root", "password");

            //Home screen:
            Scanner input = new Scanner(System.in);
            int option;
            System.out.println("What do you want to do? \n\t 1) Display all products" +
                    "\n\t 2) Display all customers \n\t 3) Display all categories \n\t" +
                    " 0) Exit \n Select an option: ");
            option = input.nextInt();

            if (option == 1) {
                displayAllProducts(connection);
            } else if (option == 2) {
                displayAllCustomers(connection);
            } else if (option == 3){
                displayAllCategories(connection);
            }
            else if (option == 0) {
                System.exit(0);
            }
        } catch (ClassNotFoundException c){
            c.printStackTrace();
        } catch (SQLException s){
            s.printStackTrace();
        }
         finally{
           if (connection!=null)
               try {
                   connection.close();
               } catch (SQLException s){
                   s.printStackTrace();
               }
        }

    }

    private static void displayPerCategory(Connection connection){
        Scanner scanner = new Scanner(System.in);
        int categoryId;
        System.out.println("Please enter a category id to see the products in that category ");
        categoryId= scanner.nextInt();
        String query = "SELECT productid, productname, unitprice, unitsinstock  FROM products " +
                "WHERE categoryId = ?";

        try ( PreparedStatement statement = connection.prepareStatement(query);){
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



    private static void displayAllCategories(Connection connection) {
        String query = "SELECT categoryid, categoryname FROM categories ORDER BY categoryid ";
        try ( PreparedStatement statement = connection.prepareStatement(query);){
            try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println(resultSet.getInt(1) + "\t" +
                                resultSet.getString(2));
                    }
                }
            displayPerCategory(connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void displayAllCustomers(Connection connection) {
        String query = "SELECT contactname, companyname, city, country, phone  FROM customers" +
                " ORDER BY country";
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


    private static void displayAllProducts(Connection connection) throws SQLException{
        String query = "SELECT productid, productname, unitprice, unitsinstock  FROM products";
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

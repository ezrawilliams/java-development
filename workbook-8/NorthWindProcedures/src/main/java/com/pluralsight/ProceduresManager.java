package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.*;

public class ProceduresManager {
    private BasicDataSource dataSource;
    Scanner scanner = new Scanner(System.in);

    public ProceduresManager(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Product> customerOrderHistory(){
        List<Product> products = new ArrayList<>();
        System.out.println("Please enter the id of the customer to see their history: ");
        String id = scanner.nextLine();
        String query = "{CALL CustOrderHist(?)}";
        try (Connection connection = dataSource.getConnection();
             CallableStatement callableStatement = connection.prepareCall(query))
        {
            callableStatement.setString(1, id);
            try (ResultSet resultSet = callableStatement.executeQuery() ) {
            while (resultSet.next()) {
                String name = resultSet.getString("ProductName");
                int total = resultSet.getInt("TOTAL");
               Product product = new Product(name, total);
               products.add(product);
            }
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;

    }

    public List<Order> salesByYear(){
        List<Order> orders = new ArrayList<>();
        System.out.println("Please enter the start date");
        String startDate = scanner.nextLine();
        System.out.println("Please enter the end date");
        String endDate = scanner.nextLine();
        String query = "{CALL `Sales by Year` (?, ?)}";
        try (Connection connection = dataSource.getConnection();
             CallableStatement callableStatement = connection.prepareCall(query))
        {
            callableStatement.setString(1, startDate);
            callableStatement.setString(2, endDate);
            try (ResultSet resultSet = callableStatement.executeQuery() ) {
                while (resultSet.next()) {
                    String shippedDate= resultSet.getString("ShippedDate");
                    int id = resultSet.getInt("OrderID");
                    double total = resultSet.getDouble("Subtotal");
                   Order order = new Order(shippedDate,id,total);
                   orders.add(order);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public List<Product> salesByCategory(){
        List<Product> products = new ArrayList<>();
        System.out.println("Please enter the category name: ");
        String categoryName = scanner.nextLine();
        System.out.println("Please enter the year");
        String year = scanner.nextLine();
        String query = "{CALL SalesByCategory(?,?)}";
        try (Connection connection = dataSource.getConnection();
             CallableStatement callableStatement = connection.prepareCall(query))
        {
            callableStatement.setString(1, categoryName);
            callableStatement.setString(2, year);
            try (ResultSet resultSet = callableStatement.executeQuery() ) {
                while (resultSet.next()) {
                    String name = resultSet.getString("ProductName");
                    int total = resultSet.getInt("TotalPurchase");
                    Product product = new Product(name, total);
                    products.add(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;

    }




}

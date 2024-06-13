package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShippersDAO {
    private BasicDataSource dataSource;
    Scanner scanner = new Scanner(System.in);

    public ShippersDAO(BasicDataSource dataSource) {
        this.dataSource=dataSource;
    }

    public List<Shipper> returnAllShippers(){
        List<Shipper> shippers = new ArrayList<>();
        String sql = "SELECT * FROM shippers;";
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            try (ResultSet resultSet = preparedStatement.executeQuery()){
                while (resultSet.next()){
                    String name = resultSet.getString("CompanyName");
                    String phone = resultSet.getString("phone");
                    Shipper shipper = new Shipper(name,phone);
                    shippers.add(shipper);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return shippers;
    }

    public void insertShipper(){

        String name, phone;
        System.out.println("Shipper name: ");
        name = scanner.nextLine();
        System.out.println("Shipper phone: ");
        phone = scanner.nextLine();
        String sql = "INSERT INTO shippers (CompanyName, Phone) VALUES (?,?);";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);){
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, phone);
            int rows = preparedStatement.executeUpdate();
            System.out.printf("Rows updated: %d\n",rows);
            try (ResultSet keys = preparedStatement.getGeneratedKeys()){
                while (keys.next()){
                    System.out.printf("The new shipper id is %d", keys.getLong(1));
                }
            }


        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updatePhoneNumber(){
        System.out.println("Please enter the id of the shipper");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the new phone number");
        String number = scanner.nextLine();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("UPDATE shippers SET phone = ? WHERE shipperid = ?");){
            preparedStatement.setString(1, number);
            preparedStatement.setInt(2, id);

            int rows = preparedStatement.executeUpdate();

            System.out.printf("Rows updated %d\n", rows);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteShipper(){
        System.out.println("Please enter the id of the shipper");
        int id = scanner.nextInt();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("DELETE FROM shippers WHERE shipperid = ?");){
            preparedStatement.setInt(1, id);

            int rows = preparedStatement.executeUpdate();

            System.out.printf("Rows deleted %d\n", rows);

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}

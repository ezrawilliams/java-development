package com.pluralsight.springdemo.dao;

import com.pluralsight.springdemo.models.Customer;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCustomerDao implements CustomerDao{
    private BasicDataSource dataSource;

    @Autowired
    public JdbcCustomerDao(BasicDataSource dataSource){
        this.dataSource=dataSource;
    }
    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM Customers;";

        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                Customer customer = new Customer();
                customer.setId(rows.getString("CustomerID"));
                customer.setName(rows.getString("CompanyName"));
                customer.setAddress(rows.getString("Address"));
                customers.add(customer);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } return customers;
    }

    @Override
    public Customer findByCustomerId(String id) {
        Customer customer = null;
        String query = "SELECT CustomerID, CompanyName, Address FROM customers WHERE" +
                " CustomerID=?;";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            statement.setString(1, id);
            try (ResultSet resultSet = statement.executeQuery()){
                if(resultSet.next()){
                    String customerId = resultSet.getString("CustomerID");
                    String companyName = resultSet.getString("CompanyName");
                    String address = resultSet.getString("Address");
                    customer = new Customer(customerId,companyName,address);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return customer;
    }
}

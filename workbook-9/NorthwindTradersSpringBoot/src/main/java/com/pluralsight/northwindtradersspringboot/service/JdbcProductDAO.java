package com.pluralsight.northwindtradersspringboot.service;

import com.pluralsight.northwindtradersspringboot.dao.ProductDAO;
import com.pluralsight.northwindtradersspringboot.model.Product;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcProductDAO implements ProductDAO {
    private BasicDataSource dataSource;

    @Autowired
    public JdbcProductDAO(BasicDataSource dataSource){
       this.dataSource=dataSource;
    }
    @Override
    public int add(Product product) {
        int id = product.getProductId();
        String name = product.getName();
        double price = product.getPrice();
        String query = "INSERT INTO products (ProductID, ProductName, UnitPrice) VALUES (?, ?, " +
                "?);";
        try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);){
                statement.setInt(1, id);
                statement.setString(2, name);
                statement.setDouble(3, price);
                int rows = statement.executeUpdate();
            System.out.println("Rows updated "+rows);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT ProductID, ProductName, UnitPrice FROM products;";
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet results = statement.executeQuery();

            while(results.next()){
                int id = results.getInt("ProductID");
                String name = results.getString("ProductName");
                double price = results.getDouble("UnitPrice");

                Product product = new Product(id, name, price);
                products.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public boolean delete(int id) {
        String query = "DELETE FROM products WHERE ProductID = ?;";
        try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            System.out.println("Rows deleted "+rows);
            if (rows>0){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Product product) {
        String query = "UPDATE products SET ProductName = ?, UnitPrice = ? " +
                "WHERE ProductID = ?";
        try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);){
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setInt(3, product.getProductId());
            int rows = statement.executeUpdate();
            if (rows>0){
                return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Product search(int id) {
        Product product = null;
        String query = "SELECT ProductID, ProductName, UnitPrice FROM products WHERE" +
                " ProductID=?;";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()){
                if(resultSet.next()){
                    int productId = resultSet.getInt("ProductID");
                    String productName = resultSet.getString("ProductName");
                    double price = resultSet.getDouble("UnitPrice");
                    product = new Product(productId, productName, price);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return product;
    }
}

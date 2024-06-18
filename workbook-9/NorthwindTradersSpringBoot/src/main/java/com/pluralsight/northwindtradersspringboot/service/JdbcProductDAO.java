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
        return 0;
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
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public Product search(int id) {
        return null;
    }
}

package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NorthwindDataManager {
    private BasicDataSource dataSource;

    public NorthwindDataManager(BasicDataSource dataSource){
        this.dataSource=dataSource;
    }

    public List<Product> getAllProducts() throws SQLException {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT ProductID, ProductName, UnitPrice FROM products;";
        Connection conn = dataSource.getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet results = statement.executeQuery();

        while(results.next()){
            int id = results.getInt("ProductID");
            String name = results.getString("ProductName");
            double price = results.getDouble("UnitPrice");

            Product product = new Product(id, name, price);
            products.add(product);
        }
        return products;
    }

  /*  public List<Product> getProductsInPriceRange(float min, float mx){
        // logic
    }*/
}

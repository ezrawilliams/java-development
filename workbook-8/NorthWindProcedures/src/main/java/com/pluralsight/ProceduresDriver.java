package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class ProceduresDriver {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        //Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3307/northwind");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        ProceduresManager proceduresManager = new ProceduresManager(dataSource);
       /* List<Product> products = proceduresManager.customerOrderHistory();
        System.out.println(products);

        List<Order> orders = proceduresManager.salesByYear();
        System.out.println(orders);*/

        List<Product> products = proceduresManager.salesByCategory();
        System.out.println(products);
    }
}

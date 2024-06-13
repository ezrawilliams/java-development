package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class ShipperDriver {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3307/northwind");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        ShippersDAO dao = new ShippersDAO(dataSource);

        List<Shipper> shipperList = dao.returnAllShippers();
     //   System.out.println(shipperList);
     //   dao.insertShipper();
     //   System.out.println(shipperList);
        dao.updatePhoneNumber();
        System.out.println(shipperList);
        dao.deleteShipper();
        System.out.println(shipperList);

    }
}

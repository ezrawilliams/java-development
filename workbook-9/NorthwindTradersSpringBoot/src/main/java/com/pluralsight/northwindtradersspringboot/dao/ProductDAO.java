package com.pluralsight.northwindtradersspringboot.dao;

import com.pluralsight.northwindtradersspringboot.model.Product;

import java.util.List;

public interface ProductDAO {
    public int add(Product product);
    public List<Product> getAll();
    public boolean delete(int id);
    public boolean update(Product product);
    public Product search(int id);
}

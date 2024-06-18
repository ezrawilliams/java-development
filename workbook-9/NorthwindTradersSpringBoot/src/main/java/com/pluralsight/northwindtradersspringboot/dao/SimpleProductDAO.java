package com.pluralsight.northwindtradersspringboot.dao;

import com.pluralsight.northwindtradersspringboot.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class SimpleProductDAO implements ProductDAO{
    private List<Product> products;

    public SimpleProductDAO(){
        products = new ArrayList<>();
        products.add(new Product(1, "Wipes", "Baby", 35.00));
        products.add(new Product(2, "Ketchup", "Pantry",5.99));
        products.add(new Product(3, "Shirt","Clothing", 35.99));
    }

    @Override
    public int add(Product product) {
        products.add(product);
        return product.getProductId();
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public boolean delete(int id) {
        for(Product product: products){
            if (product.getProductId() == id){
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Product product) {
        for(int i=0; i<products.size(); i++) {
            if (products.get(i).getProductId() == product.getProductId()) {
                products.set(i, product);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product search(int id) {
        for (Product product: products){
            if(product.getProductId()==id){
                return product;
            }
        }
        return null;
    }
}

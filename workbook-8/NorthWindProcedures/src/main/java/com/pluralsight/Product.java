package com.pluralsight;

public class Product {
    private  String productName;
    private double total;

    public Product(String productName, double total) {
        this.productName = productName;
        this.total = total;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", total=" + total +
                '}';
    }
}

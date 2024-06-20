package com.pluralsight.northwindtradersapi.models;

public class Product {
    private int productId;
    private String productName;
    private int categoryId;
    private double unitPrice;

    public Product() {
    }

    public Product(int productId, int categoryId, String productName, double unitPrice) {
        this.categoryId = categoryId;
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}

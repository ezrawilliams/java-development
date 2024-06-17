package com.pluralsight;

public class Order {
    private String shippedDate;
    private int orderId;
    private double subTotal;

    public Order(String shippedDate, int orderId, double subTotal) {
        this.shippedDate = shippedDate;
        this.orderId = orderId;
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shippedDate='" + shippedDate + '\'' +
                ", orderId=" + orderId +
                ", subTotal=" + subTotal +
                '}';
    }
}

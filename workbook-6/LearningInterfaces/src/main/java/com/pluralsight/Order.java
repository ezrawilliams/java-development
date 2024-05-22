package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String customer;
    private List<LineItem> lineItems;

    public Order(int id, String customer) {
        this.id = id;
        this.customer = customer;
        lineItems = new ArrayList<>();
    }

    public void addItem(LineItem item){
        lineItems.add(item);
    }

    public double getTotal(){
        double total = 0;
        for (LineItem item: lineItems){
            total = total + item.getLineTotal();
        }
        return total;
    }
}

package com.pluralsight;

public class Customer {
    private int id;
    private String name;
    private float amountOwed;

    public Customer(int id, String name, float amountOwed) {
        this.id = id;
        this.name = name;
        this.amountOwed = amountOwed;
    }

    @Override
    public String toString() {
        return "com.pluralsight.Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountOwed=" + amountOwed +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(float amountOwed) {
        this.amountOwed = amountOwed;
    }
}

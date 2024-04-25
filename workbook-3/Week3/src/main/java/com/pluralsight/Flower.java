package com.pluralsight;

public class Flower {
    private int flowId;
    private String flowerName;
    private String flowerColor;
    private double price;

    public Flower(int flowId, String flowerName, String flowerColor, double price) {
        this.flowId = flowId;
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.price = price;
    }

    public int getFlowId() {
        return flowId;
    }

    public void setFlowId(int flowId) {
        this.flowId = flowId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowId=" + flowId +
                ", flowerName='" + flowerName + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", price=" + price +
                '}';
    }
}

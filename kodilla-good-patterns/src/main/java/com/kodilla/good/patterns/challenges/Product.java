package com.kodilla.good.patterns.challenges;

public class Product {

    private String description;
    private double price;
    private boolean available;

    public Product(String description, double price, boolean available) {
        this.description = description;
        this.price = price;
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}

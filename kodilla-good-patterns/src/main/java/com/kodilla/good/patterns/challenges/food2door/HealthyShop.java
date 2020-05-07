package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class HealthyShop implements FoodProducer {

    private Map<Product, Integer> stock;

    public HealthyShop(Map<Product, Integer> stock) {
        this.stock = stock;
    }

    public boolean productsInStock(Map<Product, Integer> foodOrder) {
        for (Map.Entry<Product, Integer> entry : foodOrder.entrySet()) {
            if (entry.getValue() > stock.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean process(FoodOrder foodOrder) {
        if (productsInStock(foodOrder.getOrderContents())) {
            System.out.println("Order no." + foodOrder.getOrderNo() + " for " + foodOrder.foodOrderPrice() +
                    " PLN placed. Thank you for shopping in Healthy Shop!");
            return true;
        }
        System.out.println("Not enough products in stock, sorry!");
        return false;
    }
}

package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.Map;

public class HealthyShop implements FoodProducer {

    private Map<Product, BigDecimal> stock;

    public HealthyShop(Map<Product, BigDecimal> stock) {
        this.stock = stock;
    }

    public boolean productsInStock(Map<Product, BigDecimal> foodOrder) {
        for (Map.Entry<Product, BigDecimal> entry : foodOrder.entrySet()) {
            if (entry.getValue().compareTo(stock.get(entry.getKey())) > 0) {
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

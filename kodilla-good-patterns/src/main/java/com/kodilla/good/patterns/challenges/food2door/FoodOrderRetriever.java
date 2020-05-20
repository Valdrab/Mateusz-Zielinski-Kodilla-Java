package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FoodOrderRetriever {

    public FoodOrder retrieve() {

        Product product1 = new Product("Chocolate Starfish", new BigDecimal("23.99"));
        Product product2 = new Product("Purified Water", new BigDecimal("10.99"));
        Product product3 = new Product("Pork Chops", new BigDecimal("34.99"));
        Product product4 = new Product("Bread Sticks", new BigDecimal("8.12"));

        Map<Product, BigDecimal> foodOrder = new HashMap<>();
        foodOrder.put(product1, new BigDecimal("15"));
        foodOrder.put(product2, new BigDecimal("25"));
        foodOrder.put(product3, new BigDecimal("3"));
        foodOrder.put(product4, new BigDecimal("32"));

        return new FoodOrder(foodOrder, 34);
    }
}

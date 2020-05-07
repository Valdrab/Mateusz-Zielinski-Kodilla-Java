package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class FoodOrderRetriever {

    public FoodOrder retrieve() {

        Product product1 = new Product("Chocolate Starfish", 23.99);
        Product product2 = new Product("Purified Water", 10.99);
        Product product3 = new Product("Pork Chops", 34.59);
        Product product4 = new Product("Bread Sticks", 8.12);

        Map<Product, Integer> foodOrder = new HashMap<>();
        foodOrder.put(product1, 15);
        foodOrder.put(product2, 25);
        foodOrder.put(product3, 3);
        foodOrder.put(product4, 32);

        return new FoodOrder(foodOrder, 34);
    }
}

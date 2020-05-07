package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class StockRetriever {

    public Map<Product, Integer> retrieveStock() {

        Product product1 = new Product("Chocolate Starfish", 23.99);
        Product product2 = new Product("Purified Water", 10.99);
        Product product3 = new Product("Pork Chops", 34.59);
        Product product4 = new Product("Bread Sticks", 8.12);

        Map<Product, Integer> stock = new HashMap<>();
        stock.put(product1, 100);
        stock.put(product2, 300);
        stock.put(product3, 80);
        stock.put(product4, 200);

        return stock;
    }
}

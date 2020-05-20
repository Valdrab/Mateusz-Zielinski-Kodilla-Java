package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class StockRetriever {

    public Map<Product, BigDecimal> retrieveStock() {

        Product product1 = new Product("Chocolate Starfish", new BigDecimal("23.99"));
        Product product2 = new Product("Purified Water", new BigDecimal("10.99"));
        Product product3 = new Product("Pork Chops", new BigDecimal("34.99"));
        Product product4 = new Product("Bread Sticks", new BigDecimal("8.12"));

        Map<Product, BigDecimal> stock = new HashMap<>();
        stock.put(product1, new BigDecimal("100"));
        stock.put(product2, new BigDecimal("300"));
        stock.put(product3, new BigDecimal("80"));
        stock.put(product4, new BigDecimal("200"));

        return stock;
    }
}

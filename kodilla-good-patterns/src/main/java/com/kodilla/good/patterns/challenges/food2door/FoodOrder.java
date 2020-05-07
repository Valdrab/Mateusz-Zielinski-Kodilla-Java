package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class FoodOrder {

    private Map<Product, Integer> orderContents;
    private Integer orderNo;

    public FoodOrder(Map<Product, Integer> orderContents, Integer orderNo) {
        this.orderContents = orderContents;
        this.orderNo = orderNo;
    }

    public double foodOrderPrice() {
        double price = 0;
        for (Map.Entry<Product, Integer> entry : orderContents.entrySet()) {
            price += entry.getKey().getPrice() * entry.getValue();
        }
        return (double) Math.round(price * 100) / 100;
    }

    public Map<Product, Integer> getOrderContents() {
        return orderContents;
    }

    public Integer getOrderNo() {
        return orderNo;
    }
}

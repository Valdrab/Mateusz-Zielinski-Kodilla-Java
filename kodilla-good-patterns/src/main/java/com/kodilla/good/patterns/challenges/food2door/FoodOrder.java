package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.Map;

public class FoodOrder {

    private Map<Product, BigDecimal> orderContents;
    private Integer orderNo;

    public FoodOrder(Map<Product, BigDecimal> orderContents, Integer orderNo) {
        this.orderContents = orderContents;
        this.orderNo = orderNo;
    }

    public BigDecimal foodOrderPrice() {
        BigDecimal price = new BigDecimal("0");
        for (Map.Entry<Product, BigDecimal> entry : orderContents.entrySet()) {
            price = price.add(entry.getKey().getPrice().multiply(entry.getValue()));
        }
        return price;
    }

    public Map<Product, BigDecimal> getOrderContents() {
        return orderContents;
    }

    public Integer getOrderNo() {
        return orderNo;
    }
}

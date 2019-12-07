package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Random;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime orderDate) {
        System.out.println("Order created");
        return true;
    }
}

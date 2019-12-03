package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean placeOrder(User user, Product product, LocalDateTime orderDate) {
        if (product.isAvailable()) {
            System.out.println("Order for product " + product.getDescription() + ", placed by " + user.getUsername()
                    + " - confirmed (" + orderDate + ")");
        return true;

        } else {
            System.out.println("Order confirmation failed, product not available");
        return false;
        }
    }
}



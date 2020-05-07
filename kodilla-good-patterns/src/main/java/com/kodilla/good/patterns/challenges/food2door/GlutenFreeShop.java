package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements FoodProducer {
    @Override
    public boolean process(FoodOrder foodOrder) {
        System.out.println("Order received. Remember our motto: 'Gluten is bad for you!'");
        return true;
    }
}

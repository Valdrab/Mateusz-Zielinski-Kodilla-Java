package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements FoodProducer {
    @Override
    public boolean process(FoodOrder foodOrder) {
        System.out.println("We're closed due to the pandemic, but what the hell, order received!");
        return true;
    }
}

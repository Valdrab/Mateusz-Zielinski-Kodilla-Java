package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements FoodProducer {
    @Override
    public boolean process(FoodOrder foodOrder) {
        System.out.println("We're close due to the pandemic. Run for your lives!");
        return false;
    }
}

package com.kodilla.good.patterns.challenges.food2door;

public class Processor {

    private FoodProducer foodProducer;
    private FoodOrder foodOrder;

    public Processor(FoodProducer foodProducer, FoodOrder foodOrder) {
        this.foodProducer = foodProducer;
        this.foodOrder = foodOrder;
    }

    public void process() {
        boolean readyToProcess = foodProducer.process(foodOrder);
        if (readyToProcess) {
            System.out.println("Order processed, thank you.");
        } else {
            System.out.println("Cannot process the order.");
        }
    }
}

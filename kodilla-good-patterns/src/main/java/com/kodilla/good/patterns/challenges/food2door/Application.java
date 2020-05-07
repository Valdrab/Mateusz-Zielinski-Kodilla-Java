package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        FoodOrderRetriever orderRetriever = new FoodOrderRetriever();
        FoodOrder order = orderRetriever.retrieve();
        StockRetriever stockRetriever = new StockRetriever();
        FoodProducer producer = new HealthyShop(stockRetriever.retrieveStock());

        Processor processor = new Processor(producer, order);
        processor.process();
    }
}

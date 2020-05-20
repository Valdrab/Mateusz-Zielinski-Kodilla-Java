package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        ConnectionFinder connectionFinder = new ConnectionFinder();
        System.out.println(connectionFinder.flightsFrom("Warszawa"));
        System.out.println(connectionFinder.flightsTo("Warszawa"));
        System.out.println(connectionFinder.interconnectingFlights("Gdańsk", "Kraków"));
    }
}

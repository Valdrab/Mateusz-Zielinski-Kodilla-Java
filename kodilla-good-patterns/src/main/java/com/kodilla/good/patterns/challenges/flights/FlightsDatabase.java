package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsDatabase {

    private Set<Flight> flightsDatabase() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Szczecin", "Poznań"));
        flights.add(new Flight("Wrocław", "Gdańsk"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Poznań", "Szczecin"));

        return flights;
    }
}

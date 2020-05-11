package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsDatabaseRetriever {

    public Set<Flight> retrieveFlightsDatabase() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Szczecin", "Poznań"));
        flights.add(new Flight("Wrocław", "Gdańsk"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Poznań", "Szczecin"));
        flights.add(new Flight("Katowice", "Warszawa"));
        flights.add(new Flight("Warszawa", "Bydgoszcz"));
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Warszawa", "Wrocław"));

        return flights;
    }
}

package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConnectionFinder {

    private Set<Flight> flights;

    public ConnectionFinder() {
        FlightsDatabaseRetriever retriever = new FlightsDatabaseRetriever();
        this.flights = retriever.retrieveFlightsDatabase();
    }

    public Set<Flight> flightsFrom(String departure) {
        return flights.stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toSet());
    }

    public Set<Flight> flightsTo(String arrival) {
        return flights.stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toSet());
    }

    public Set<InterconnectingFlight> interconnectingFlights(String departure, String arrival) {
        Set<InterconnectingFlight> interFlights = new HashSet<>();
        for (Flight flightVia : flightsFrom(departure)) {
            for (Flight flightTo : flightsTo(arrival)) {
                if (flightVia.getArrival().equals(flightTo.getDeparture())) {
                    interFlights.add(new InterconnectingFlight(flightVia, flightTo));
                }
            }
        }
        return interFlights;
    }
}

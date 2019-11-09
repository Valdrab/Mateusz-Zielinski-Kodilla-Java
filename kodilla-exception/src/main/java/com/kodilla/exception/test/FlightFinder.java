package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("HOU", true);
        airportsMap.put("MIA", false);
        airportsMap.put("DKR", true);
        airportsMap.put("IEV", true);
        airportsMap.put("THR", false);

        if (airportsMap.get(flight.getDepartureAirport()) && airportsMap.get(flight.getArrivalAirport())
            && airportsMap.containsValue(true) && !flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            System.out.println("Route found: " + flight.getDepartureAirport() + " -> " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        //In case of airport being unavailable
        try {
            flightFinder.findFlight(new Flight("HOU", "MIA"));
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found... " + e);
        } finally {
            System.out.println("Waiting for input...");
        }

        System.out.println("------------------------");

        //In case of available airports
        try {
            flightFinder.findFlight(new Flight("DKR", "IEV"));
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found..." + e);
        } finally {
            System.out.println("Waiting for input...");
        }
    }
}

package com.kodilla.good.patterns.challenges.flights;

public class Flight {

    private String departure;
    private String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!getDeparture().equals(flight.getDeparture())) return false;
        return getArrival().equals(flight.getArrival());
    }

    @Override
    public int hashCode() {
        int result = getDeparture().hashCode();
        result = 31 * result + getArrival().hashCode();
        return result;
    }
}

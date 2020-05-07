package com.kodilla.good.patterns.challenges.flights;

public class Flight {

    private String departingFrom;
    private String arrivingIn;

    public Flight(String departingFrom, String arrivingIn) {
        this.departingFrom = departingFrom;
        this.arrivingIn = arrivingIn;
    }

    public String getDepartingFrom() {
        return departingFrom;
    }

    public String getArrivingIn() {
        return arrivingIn;
    }
    @Override
    public String toString() {
        return "Flight{" +
                "departingFrom='" + departingFrom + '\'' +
                ", arrivingIn='" + arrivingIn + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!getDepartingFrom().equals(flight.getDepartingFrom())) return false;
        return getArrivingIn().equals(flight.getArrivingIn());
    }
    @Override
    public int hashCode() {
        int result = getDepartingFrom().hashCode();
        result = 31 * result + getArrivingIn().hashCode();
        return result;
    }
}

package com.kodilla.good.patterns.challenges.flights;

public class InterconnectingFlight {

    private Flight flightVia;
    private Flight flightTo;

    public InterconnectingFlight(Flight flightVia, Flight flightTo) {
        this.flightVia = flightVia;
        this.flightTo = flightTo;
    }

    public Flight getFlightVia() {
        return flightVia;
    }

    public Flight getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "InterconnectingFlight{" +
                "flightVia=" + flightVia +
                ", flightTo=" + flightTo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterconnectingFlight that = (InterconnectingFlight) o;

        if (!getFlightVia().equals(that.getFlightVia())) return false;
        return getFlightTo().equals(that.getFlightTo());
    }

    @Override
    public int hashCode() {
        int result = getFlightVia().hashCode();
        result = 31 * result + getFlightTo().hashCode();
        return result;
    }
}

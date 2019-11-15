package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> listOfCountries = new ArrayList<>();

    public boolean addCountry(Country country){
        return listOfCountries.add(country);
    }

    public List<Country> getListOfCountries() {
        return new ArrayList<>(listOfCountries);
    }
}

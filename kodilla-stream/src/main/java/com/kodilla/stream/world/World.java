package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal worldPeopleQuantity = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return worldPeopleQuantity;
    }
}

package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent asia = new Continent();
        Continent europe = new Continent();
        Continent africa = new Continent();
        Country japan = new Country("Japan", new BigDecimal("125000000"));
        Country china = new Country("China", new BigDecimal("1420000000"));
        Country russia = new Country("Russia", new BigDecimal("146000000"));
        Country denmark = new Country("Denmark", new BigDecimal("5800000"));
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("83000000"));
        Country gabon = new Country("Gabon", new BigDecimal("1900000"));
        Country sudan = new Country("Sudan", new BigDecimal("37000000"));
        Country egypt = new Country("Egypt", new BigDecimal("95000000"));

        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(russia);
        europe.addCountry(denmark);
        europe.addCountry(poland);
        europe.addCountry(germany);
        africa.addCountry(gabon);
        africa.addCountry(sudan);
        africa.addCountry(egypt);

        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);
        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("1951700000");
        Assert.assertEquals(expectedWorldPeopleQuantity, worldPeopleQuantity);
    }
}

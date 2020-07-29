package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithExtraIngredientsFamilySizeOnThickerDoughGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraIngredientsDecorator(pizzaOrder, ExtraIngredient.HAM);
        pizzaOrder = new ExtraIngredientsDecorator(pizzaOrder, ExtraIngredient.SHRIMPS);
        pizzaOrder = new FamilySizeDecorator(pizzaOrder);
        pizzaOrder = new ThickerDoughDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal("37.00"), cost);
    }

    @Test
    public void testPizzaOrderWithExtraIngredientsFamilySizeOnThickerDoughGetDesc() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraIngredientsDecorator(pizzaOrder, ExtraIngredient.MUSHROOMS);
        pizzaOrder = new ExtraIngredientsDecorator(pizzaOrder, ExtraIngredient.PAPRIKA);
        pizzaOrder = new FamilySizeDecorator(pizzaOrder);
        pizzaOrder = new ThickerDoughDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDesc());
        //When
        String desc = pizzaOrder.getDesc();
        //Then
        assertEquals("Order for a pizza with a tomato sauce" +
                " and cheese + mushrooms + paprika, family size, on thicker dough", desc);
    }
}

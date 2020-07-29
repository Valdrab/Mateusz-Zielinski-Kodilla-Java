package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraIngredientsDecorator extends AbstractPizzaOrderDecorator {
    private final ExtraIngredient extraIngredient;

    public ExtraIngredientsDecorator(PizzaOrder pizzaOrder, ExtraIngredient extraIngredient) {
        super(pizzaOrder);
        this.extraIngredient = extraIngredient;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("3.50"));
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " + " + extraIngredient.name().toLowerCase();
    }
}

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickerDoughDecorator extends AbstractPizzaOrderDecorator {
    public ThickerDoughDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("5.00"));
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", on thicker dough";
    }
}

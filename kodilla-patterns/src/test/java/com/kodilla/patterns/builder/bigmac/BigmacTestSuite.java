package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.SESAME)
                .burgers(2)
                .sauce(SauceType.THOUSAND_ISLES)
                .ingredient(IngredientType.BACON)
                .ingredient(IngredientType.CHEESE)
                .ingredient(IngredientType.SALAD)
                .build();
        System.out.println(bigmac);
        //When
        int burgersQuantity = bigmac.getBurgers();
        int ingredientsQuantity = bigmac.getIngredients().size();
        BunType kindOfBun = bigmac.getBun();
        //Then
        Assert.assertEquals(2, burgersQuantity);
        Assert.assertEquals(3, ingredientsQuantity);
        Assert.assertEquals(BunType.SESAME, kindOfBun);
        Assert.assertFalse(bigmac.getIngredients().contains(IngredientType.MUSHROOMS));

    }
}

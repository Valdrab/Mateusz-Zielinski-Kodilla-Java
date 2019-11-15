package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {1,3,7,12,19,22,25,4,33,2,5,17,1,3,19,2,5,9,32,8};
        //When
        double result = ArrayOperations.getAverage(numbers);
        double expectedResult = 11.45;
        //Then
        Assert.assertEquals(expectedResult, result, 0.01);
    }
}

package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList <Integer> numbers = new ArrayList<>();
        //When
        OddNumbersExterminator.exterminate(numbers);
        int result = numbers.size();
        System.out.println("Testing size: " + result);
        //Then
        Assert.assertEquals(0, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        //When
        OddNumbersExterminator.exterminate(numbers);

        System.out.println();
        //Then

    }

    }



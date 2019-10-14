package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;
import java.util.Objects;

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
        System.out.println("Test Suite OddNumbersExterminator: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite OddNumbersExterminator: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList <Integer> numbers = new ArrayList<>();
        //When
        ArrayList evenNumList = OddNumbersExterminator.exterminate(numbers);
        boolean result = numbers.isEmpty();
        boolean result1 = evenNumList.isEmpty();
        System.out.println("Testing if empty: numbers list - " + result + ", even numbers list - " + result1);
        //Then
        Assert.assertTrue(result);
        Assert.assertTrue(result1);
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
        ArrayList evenNumList = OddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing: numbers list " + numbers + " even numbers list: " + evenNumList);
        boolean result = evenNumList.contains(2);
        boolean result1 = numbers.contains(2);
        //Then
        Assert.assertTrue(result);
        Assert.assertTrue(result1);
    }

    }



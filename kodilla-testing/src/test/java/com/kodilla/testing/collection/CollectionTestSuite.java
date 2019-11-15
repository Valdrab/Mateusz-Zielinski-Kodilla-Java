package com.kodilla.testing.collection;
import org.assertj.core.api.Assertions;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite OddNumbersExterminator: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite OddNumbersExterminator: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> evenNumList = OddNumbersExterminator.exterminate(numbers);
        boolean result = numbers.isEmpty();
        boolean result1 = evenNumList.isEmpty();
        System.out.println("Testing if empty: numbers list - " + result + ", even numbers list - " + result1);
        //Then
        Assert.assertTrue(result);
        Assert.assertTrue(result1);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        //When
        List<Integer> evenNumList = OddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing: numbers list " + numbers + " even numbers list: " + evenNumList);
        //Then
        Assertions.assertThat(evenNumList).containsOnly(2, 4, 6);
    }
}



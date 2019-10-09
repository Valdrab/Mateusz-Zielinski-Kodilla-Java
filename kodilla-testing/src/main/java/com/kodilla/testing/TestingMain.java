package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - Calculator class - adding:");

        Calculator calculator = new Calculator();

        int resultOfAdding = calculator.add(12, 80);
        int expectedResultOfAdding = 92;

        if (resultOfAdding == expectedResultOfAdding) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - Calculator class - subtracting:");

        int resultOfSubtracting = calculator.subtract(20, 5);
        int expectedResultOfSubtracting = 15;

        if (resultOfSubtracting == expectedResultOfSubtracting) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}

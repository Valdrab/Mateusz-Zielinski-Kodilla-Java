package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static void exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumList = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumList.add(number);
            }
        }
        System.out.println(evenNumList);
    }
}


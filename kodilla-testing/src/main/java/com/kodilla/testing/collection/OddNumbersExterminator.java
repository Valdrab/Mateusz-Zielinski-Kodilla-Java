package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {

            ArrayList<Integer> evenNumList = new ArrayList<>();

            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenNumList.add(number);
                }
            }
            return evenNumList;
        }
    }
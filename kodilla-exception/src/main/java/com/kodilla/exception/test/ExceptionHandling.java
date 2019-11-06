package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = null;
        try {
            result = secondChallenge.probablyIWillThrowException(3.0, 2.0);
        } catch (Exception e) {
            System.out.println("Illegal x or y parameters: " + e);
        } finally {
            System.out.println("Result: " + result);
        }
    }
}

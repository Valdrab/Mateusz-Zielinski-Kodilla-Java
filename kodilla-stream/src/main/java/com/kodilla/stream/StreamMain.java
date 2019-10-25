package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("To be or not to be", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("To be or not to be", (text -> text.toUpperCase()));
        poemBeautifier.beautify("To be or not to be,", (text -> text.concat(" that is the question")));
        poemBeautifier.beautify("TO BE OR NOT TO BE", (String::toLowerCase));
        poemBeautifier.beautify("To be or not to be", (text -> text.replace('o', 'a')));
        poemBeautifier.beautify("To be or not to be,", (text -> text.concat(" this is the hashcode of that question: ") + text.hashCode()));

    }
}
package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int number) {
        int result = sum(number);
        int resultMinus = minus(number);
        int resultMulti = multiply(number);
        int resultDev = divide(number);
        return result + resultMinus + resultMulti + resultDev;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int resultMulti = calculator.multiply(5);
        System.out.println(resultMulti);

        int resultMinus = minus(10);
        System.out.println(resultMinus);

        Calculator calculatorDev = new Calculator();
        int resultDev = calculatorDev.divide(30);
        System.out.println(resultDev);

        Calculator calculatorsumAllOperation = new Calculator();
        int resultsumAllOperation = calculatorsumAllOperation.sumAllOperation(10);
        System.out.println(resultsumAllOperation);
    }
}
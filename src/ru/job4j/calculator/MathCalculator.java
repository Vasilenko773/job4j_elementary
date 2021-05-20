package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifAndDiv(double first, double second) {
        return sum(difference(second, first), division(second, first));
    }

    public static double all(double first, double second) {
        return difference(second, first) + division(second, first)
                + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10,
                20));
        System.out.println("Результат расчета равен: " + sumDifAndDiv(5,
                15));
        System.out.println("Результат расчета равен: " + all(15, 30));
    }
}
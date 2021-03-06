package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        int y = x * 2;
        return y;
    }
    public static int func2(int b) {
        int y = b / 10;
        return y;
            }

    public static void main (String[] args) {
        int result1 = MathFunc.func1(100);
        int result2 = MathFunc.func2(90);
                int total = result1 + result2;
        System.out.println(total);
    }
}

package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
         //  if i = 0 >= 1) {
                result = result * i;
            }
        return result;
    }
}

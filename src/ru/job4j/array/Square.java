package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = i * i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
    }
    }
}

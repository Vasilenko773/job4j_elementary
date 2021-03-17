package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (i * 2) + 3;
            System.out.println(ints[i]);
        }
    }
}

package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
             System.out.println("Текущий элемент массива начиная с последнего: " + num[num.length - 1 - i]);
            }
        }
    }
}

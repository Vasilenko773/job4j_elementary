package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        int s = l * h;
        return s;
            }

    public static void main(String[] args) {
        int result = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result);
    }
}

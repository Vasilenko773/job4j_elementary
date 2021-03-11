package ru.job4j.condition;

public class PointEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return (x1 == x2) && (y1 == y2);
    }

    public static void main(String[] args) {
        boolean rsl = eq(1, 1,  2, 2);
        boolean rsl1 = eq(10, 10, 10, 10);
        System.out.println(rsl);
        System.out.println(rsl1);
    }
}

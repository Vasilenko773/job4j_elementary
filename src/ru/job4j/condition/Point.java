package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rls = x2 - x1;
        double first1 = Math.pow(rls, 2);
        double rls2 = y2 - y1;
        double first2 = Math.pow(rls2, 2);
        double lenght = first1 + first2;
        double root = Math.sqrt(lenght);
        return root;
    }

    public static void main(String[] agrg) {
        double result = Point.distance(1, 3, 3, 4);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }

}

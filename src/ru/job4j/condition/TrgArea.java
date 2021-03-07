package ru.job4j.condition;

public class TrgArea {
    public static double trgarea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double g = p * ((p - a) * (p - b) * (p - c));
        double root = Math.sqrt(g);
        return root;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.trgarea(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}

package ru.job4j.converter;

public class Converter {

public static int rubleToEuro(int value) {
                return value / 70;
        }

public static int rubleToDollar(int value) {
                return value / 60;
        }

public static void main(String[] args) {
        int euro = Converter.rubleToEuro(280);
        int dollar = Converter.rubleToDollar(120);
        int ineu = 280;
        int expectedeu = 4;
        int outeu = Converter.rubleToEuro(ineu);
        boolean passedeu = expectedeu == outeu;
        int indl = 120;
        int expecteddl = 2;
        int outdl = Converter.rubleToDollar(indl);
        boolean passeddl = expecteddl == outdl;
        System.out.println("280 rubles are 4 euro. Test result : " + passedeu);
        System.out.println("120 rubles are 2 dollar. Test result : " + passeddl);
        }
}

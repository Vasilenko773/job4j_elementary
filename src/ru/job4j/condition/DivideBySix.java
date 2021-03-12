package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl = "";
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = ("Исходное число делится на 6."); // System.out.println
        } else if (number % 3 != 0 && number % 2 != 0) {
            rsl = ("Исходное число не делится на 3 и не является четным"); // System.out.println
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = ("Исходное число делится на 3, но не является четным"); //System.out.println
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = ("Исходное число не делится на 3, но является четным"); //System.out.println
        }
        return rsl;
    }

        public static void main(String[] args) {
        String a = DivideBySix.checkNumber(24);
        System.out.println(a);
        }
   }
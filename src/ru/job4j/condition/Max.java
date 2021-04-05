package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
        }

        public static int max(int left, int right, int straight) {
        return max(left, max(right, straight));
        }

        public static int max(int one, int two, int three, int four) {
        return max(one, two, max(three, four));
        }

        public static void main(String[] args) {
        int b = Max.max(11, 1111);
        System.out.println(b);
        int c = max(11, 1, 28);
        System.out.println(c);
        int d = max(1, 6, 4, 5);
        System.out.println(d);
        }
    }

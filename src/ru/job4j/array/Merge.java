package ru.job4j.array;

public class Merge {

        public static int[] merge(int[] left, int[] right) {
            int[] rsl = new int[left.length + right.length];
            for (int i = 0; i < left.length; i++) {
                rsl[i] = left[i];
            }
            for (int i = 0; i < right.length; i++) {
                rsl[i + left.length] = right[i];
            }
            boolean win = false;
            while (!win) {
                win = true;
                for (int i = 1; i < rsl.length; i++) {
                    if (rsl[i] < rsl[i - 1]) {
                        int temp = rsl[i];
                        rsl[i] = rsl[i - 1];
                        rsl[i - 1] = temp;
                        win = false;
                    }
                }
            }
            return rsl;
        }
    }


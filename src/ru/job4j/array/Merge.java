package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int j = 0;
        int i = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (i > left.length - 1) {
                int first = right[j];
                rsl[k] = first;
                j++;
            } else if (j > right.length - 1) {
                int first2 = left[i];
                rsl[k] = first2;
                i++;
            } else if (left[i] < right[j]) {
                int first = left[i];
                rsl[k] = first;
                i++;
            } else {
                int first2 = right[j];
                rsl[k] = first2;
                j++;
            }

        }
        return rsl;
    }
}


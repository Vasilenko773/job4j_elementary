package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int j = 0;
        int size = 0;
        int sum = money - price;
        while (sum > 0) {
            size++;

            for (int i = 0; i < coins.length; i++) {
                if (sum / coins[i] >= 1) {
                    rsl[j] = coins[i];
                    sum = sum - rsl[j];
                    j++;
                    break;
                }
               /* if (sum / coins[0] >= 1) { // должен быьб один иф
                    rsl[i] = coins[i];
                    sum = sum - rsl[i];
                    size++;
                } else {
                    break;
                } else if (sum / coins[1] >= 1) {
                    rsl[i] = 5;
                    sum = sum - rsl[i];
                    size++;
                } else if (sum / coins[2] >= 1) {
                    rsl[i] = 2;
                    sum = sum - rsl[i];
                    size++;
                } else if (sum / coins[3] == 1) {
                rsl[i] = 1;
                    sum = sum - rsl[i];
                    size++;
               // } else {
                 //   break; */
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}


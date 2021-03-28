package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int i = 0; i < rsl.length; i++) {
            if (sum == 0) {
                break;
            }
            while (sum - coins[i] >= 0) {
                sum = sum - coins[i];
                rsl[i] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
              /* if (sum - coins[i] >= 0) {
                   rsl[i] = coins[i];
                   sum = sum - coins[i];
                   size++;
                   break; */

               //    coins[i] = coins[0];
                // rsl[i] = co[0]
              //  sum = 0;
              //  break;
               // while (sum - coins[j] >= 0) {
                //if (sum / coins[i] >= 0) {

                  //  j++;}

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
        //return Arrays.copyOf(rsl, size);
          //  }
      //  return Arrays.copyOf(rsl, size);
      //  }
     //   return Arrays.copyOf(rsl, size);
   // }
//}


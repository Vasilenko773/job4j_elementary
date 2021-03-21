package ru.job4j.array;

 public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
           if (data[i] == el) {
                rsl = i;
                break;
            }
        }
            return rsl;
    }

   public static int indexOf(int[] data, int el, int start, int finish) {
      int rsl = -1;
      for (int j = start; j <= finish; j++) {
          if (data[j] == el) {
              rsl = j;
              break;
          }
      }
      return rsl;
   }
}


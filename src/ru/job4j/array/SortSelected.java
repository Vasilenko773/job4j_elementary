package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int j = FindLoop.indexOf(data, min, i, data.length - 1);
            min = data[j];
          SwitchArray.swap(data, i, j);
          /*  int first = data[i];
            data[i] = data[j];
            data[j] = first; // это работает
           */
        }
        return data;
    }
}

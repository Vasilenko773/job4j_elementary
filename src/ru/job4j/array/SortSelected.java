package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int j = FindLoop.indexOf(data, min, i, data.length - 1);
            min = data[j]; // до сих пор правильно
            int first = data[i];
            data[i] = data[j];
            data[j] = first; // после можно написать если (i[0] равно мини), минимум  = мин + 1
            /*if (data[i] - data[j] == 1) {
                int two = data[1];
                data[1] = data[j];
                data[j] = two;*/

        }
        return data;
    }
}

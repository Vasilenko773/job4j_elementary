package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // возможно --} int temp = array[0];
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            i++; // до этого верно
            int rsl = array[i]; // 0
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = rsl;
            break;
           }
        return array;
    }
}

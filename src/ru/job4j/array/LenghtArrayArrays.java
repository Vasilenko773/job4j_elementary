package ru.job4j.array;

public class LenghtArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 3}, {4, 6, 2}, {1, 2, 3, 4}};
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("Размер вложенного массива равен: " + numbers[j].length);
        }
    }
}

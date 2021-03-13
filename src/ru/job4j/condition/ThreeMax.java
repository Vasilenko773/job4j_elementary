package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) { //int
        int result = first;
        if (first < second && first > third) { // 1<,
            result = second;
        }
        if (second > first && second <= third) { //2<
            result = third;
        }
        return result;
    }
}



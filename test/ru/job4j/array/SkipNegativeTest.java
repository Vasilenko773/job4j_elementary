package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SkipNegativeTest {

    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayRow5AndColumnNotEquals() {
        int[][] array = {
                {1, -2, 2},
                {1, -2, -3, 2},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5, -6}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0, 2},
                {1, 0, 0, 2},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5, 0}
        };
        Assert.assertArrayEquals(expected, result);
    }
}
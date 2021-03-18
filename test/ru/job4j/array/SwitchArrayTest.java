package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expexted = {4, 2, 3, 1};
        Assert.assertArrayEquals(expexted, result);
    }

    @Test
    public void whemSwap1to4() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expexted = {1, 4, 3, 2};
        Assert.assertArrayEquals(expexted, result);
    }

    @Test
    public void whemSwap3to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 2;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expexted = {1, 2, 8, 4, 5, 6, 7, 3};
        Assert.assertArrayEquals(expexted, result);
    }
}
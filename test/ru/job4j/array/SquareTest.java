package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expexted = new int[] {0, 1, 4};
        Assert.assertArrayEquals(expexted, result);
            }

            @Test
    public void whenBound4Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expexted = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expexted, result);
            }
}

package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4Then1() {
        int[] data = {5, 4, 3, 2};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas8Then1() {
        int[] data = {1, 2, 4, 5, 6, 7, 8, 1, 22};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength6Then2() {
        int[] data = new int[]{1, 10, 6, 9, 7, 8, 3};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength1Then1() {
        int[] data = new int[]{0, 10, 6, 9, 7, 8, 3};
        int el = 1;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}


package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert280RbThen4Euro() {
    int ineu = 280;
    int expectedeu = 4;
    int outeu = Converter.rubleToEuro(ineu);
    Assert.assertEquals(expectedeu, outeu);
    }

    @Test
    public void whenConvert120RblThen2Dlr() {
        int indl = 120;
        int expecefdl = 2;
        int outdl = Converter.rubleToDollar(indl);
        Assert.assertEquals(expecefdl, outdl);
    }
}
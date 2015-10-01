package com.eu.utility;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumberUtilityTest {

    @Test
    public void t1_numberToWordTest() {
        BigDecimal number = new BigDecimal(1);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bir", result);
    }

    @Test
    public void t10_numberToWordTest() {
        BigDecimal number = new BigDecimal(10);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("on", result);
    }

    @Test
    public void t11_numberToWordTest() {
        BigDecimal number = new BigDecimal(11);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("onbir", result);
    }

    @Test
    public void t100_numberToWordTest() {
        BigDecimal number = new BigDecimal(100);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("yüz", result);
    }

    @Test
    public void t101_numberToWordTest() {
        BigDecimal number = new BigDecimal(101);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("yüz bir", result);
    }

    @Test
    public void t110_numberToWordTest() {
        BigDecimal number = new BigDecimal(110);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("yüz on", result);
    }

    @Test
    public void t111_numberToWordTest() {
        BigDecimal number = new BigDecimal(111);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("yüz onbir", result);
    }

    @Test
    public void t1000_numberToWordTest() {
        BigDecimal number = new BigDecimal(1000);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin", result);
    }

    @Test
    public void t1001_numberToWordTest() {
        BigDecimal number = new BigDecimal(1001);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin bir", result);
    }

    @Test
    public void t1010_numberToWordTest() {
        BigDecimal number = new BigDecimal(1010);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin on", result);
    }

    @Test
    public void t1011_numberToWordTest() {
        BigDecimal number = new BigDecimal(1011);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin onbir", result);
    }

    @Test
    public void t1100_numberToWordTest() {
        BigDecimal number = new BigDecimal(1100);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin yüz", result);
    }

    @Test
    public void t1101_numberToWordTest() {
        BigDecimal number = new BigDecimal(1101);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin yüz bir", result);
    }

    @Test
    public void t1110_numberToWordTest() {
        BigDecimal number = new BigDecimal(1110);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin yüz on", result);
    }

    @Test
    public void t1111_numberToWordTest() {
        BigDecimal number = new BigDecimal(1111);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bin yüz onbir", result);
    }

    @Test
    public void t10000_numberToWordTest() {
        BigDecimal number = new BigDecimal(10000);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("on bin", result);
    }

    @Test
    public void t100000_numberToWordTest() {
        BigDecimal number = new BigDecimal(100000);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("yüz bin", result);
    }

    @Test
    public void t1000000_numberToWordTest() {
        BigDecimal number = new BigDecimal(1000000);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bir milyon", result);
    }

    @Test
    public void t10000000_numberToWordTest() {
        BigDecimal number = new BigDecimal(10000000);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("on milyon", result);
    }

    @Test
    public void t100000000_numberToWordTest() {
        BigDecimal number = new BigDecimal(100000000);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("yüz milyon", result);
    }

    @Test
    public void t1000000000_numberToWordTest() {
        BigDecimal number = new BigDecimal(1000000000);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bir milyar", result);
    }

    @Test
    public void t1000000000000_numberToWordTest() {
        BigDecimal number = new BigDecimal(1000000000000L);
        number.setScale(2, BigDecimal.ROUND_DOWN);
        String result = NumberUtility.convertToWords(number);
        Assert.assertEquals("bir trilyon", result);
    }

}

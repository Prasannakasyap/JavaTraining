package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {

    @Test
    public void testData() {
        Data data1 = null;
        assertNull(data1);
        Data data2 = new Data();
        assertNotNull(data2);
    }
    @Test
    public void testArray() {
        int[] a = {-4,23,66,33,28};
        int[] b = {-4,23,66,33,28};
        assertArrayEquals(a, b);
    }

    @Test
    public void testEvenOdd() {
        Data obj = new Data();
        assertTrue(obj.posNeg(10));
        assertFalse(obj.posNeg(-42));
    }
    @Test
    public void testPosNeg() {
        Data obj = new Data();
        assertTrue(obj.posNeg(5));
        assertFalse(obj.posNeg(-5));
    }
    @Test
    public void testMinArray() {
        int[] a = {-4,23,66,33,28};
        Data obj = new Data();
        assertEquals(-4, obj.minArray(a));
    }
    @Test
    public void testMax3() {
        Data obj = new Data();
        assertEquals(5, obj.max3(5, 2, 3));
        assertEquals(5, obj.max3(2, 5, 3));
        assertEquals(5, obj.max3(3, 2, 5));
    }

    @Test
    public void testFact() {
        Data obj = new Data();
        assertEquals(120, obj.fact(5));
    }
    @Test
    public void testSum() {
        Data obj = new Data();
        assertEquals(5, obj.sum(2, 3));
    }
    @Test
    public void testSayHello() {
        Data obj = new Data();
        assertEquals("Welcome to Java Programming...", obj.sayHello());

    }
}

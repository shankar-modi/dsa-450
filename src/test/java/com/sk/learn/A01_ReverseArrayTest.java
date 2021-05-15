package com.sk.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A01_ReverseArrayTest {

    A01_ReverseArray service = new A01_ReverseArray();


    @Test
    void testReverseIterative() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = service.reverseIterative(input);
        assertArrayEquals(expected,result);
    }
}
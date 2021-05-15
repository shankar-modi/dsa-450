package com.sk.learn;

import java.util.Arrays;

public class A01_ReverseArray {

    public static void main(String[] args) {
        A01_ReverseArray service = new A01_ReverseArray();
        int[] input = {1, 2, 3, 4, 5};

        System.out.println("Input : " + Arrays.toString(input));

        int[] result = service.reverseIterative(input);

        System.out.println("Output : " + Arrays.toString(result));

        System.out.println("------- Recursive--------");
        System.out.println("Input : " + Arrays.toString(input));
        result = service.reverseRecursive(input, 0, input.length - 1);
        System.out.println("Output : " + Arrays.toString(result));

    }

    public int[] reverseIterative(int[] input) {
        int start = 0;
        int end = input.length - 1;

        while (start < end) {
            swap(input, start, end);
            start++;
            end--;
        }
        return input;
    }

    private void swap(int[] input, int start, int end) {
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }

    public int[] reverseRecursive(int[] input, int start, int end) {

        if (start >= end) return input;
        swap(input, start, end);
        return reverseRecursive(input, start + 1 , end - 1);
    }
}

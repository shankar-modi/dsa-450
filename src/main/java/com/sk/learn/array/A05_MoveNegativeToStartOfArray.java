package com.sk.learn.array;

import java.util.Arrays;

public class A05_MoveNegativeToStartOfArray {

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};

        System.out.println("----- After Move-----");
        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void move(int[] arr){
        int i=0, j = 0;

        while (j < arr.length){
            if(arr[j] < 0) {
                swap(arr, i ,j);
                i++;
                j++;
            }else{
                j++;
            }
        }
    }

    private static void swap(int[] input, int start, int end) {
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }
}

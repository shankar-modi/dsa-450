package com.sk.learn.array;

public class A06_LargestSumSubArray {

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};

        subArray(arr);

        int[] arr1 = {1, 2, 3, -2, 5};
        subArray(arr1);

        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        subArray(a);
    }

    private static void subArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        int maxEndHere = 0;
        int start = 0, end = 0, startPrev=0;
        for (int i = 0; i < arr.length; i++) {
            maxEndHere += arr[i];

//            max = Integer.max(max, maxEndHere);
            if(max < maxEndHere){
                max = maxEndHere;
                start = startPrev;
                end = i;
            }

            if (maxEndHere < 0) {
                maxEndHere = 0;
                startPrev = i+1;
            }
        }

        System.out.println("start -> "+start+" end -> "+end);
        System.out.println("Max sub Array sum -> " + max);
    }
}

package com.sk.learn.array;

import java.util.Arrays;

public class A04_SortArrayWith0_1_2 {

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 0, 1, 1, 0, 0, 2};

        System.out.println("-----Input-----");
        //Approach 1 - > sort the array -> Time complexity O(nlogn)

        //Approach 2
        System.out.println(Arrays.toString(input));
        sortAppr2(input);

        //Approach 3
        System.out.println("------Sort Approach 3-------");
        sortAppr3(input);
        System.out.println(Arrays.toString(input));
    }

    /**
     * Time Complexity O(n) - Two traversal required
     * count the no. of 0 , 1 , 2
     *
     * @param input
     */
    public static void sortAppr2(int[] input) {
        int ctr0 = 0, ctr1 = 0, ctr2 = 0;

        for (int i = 0; i < input.length; i++) {

            switch (input[i]) {
                case 0:
                    ctr0++;
                    break;
                case 1:
                    ctr1++;
                    break;
                case 2:
                    ctr2++;
                    break;
            }
        }

        System.out.println("ctr0 -> " + ctr0 + ", ctr1 -> " + ctr1 + ", ctr2 -> " + ctr2);

        int[] newArr = new int[ctr0+ctr1+ctr2];
        int k = 0;
        while (ctr0 > 0){
            newArr[k++] = 0;
            ctr0--;
        }

        while (ctr1 > 0){
            newArr[k++] = 1;
            ctr1--;
        }

        while (ctr2 > 0){
            newArr[k++] = 2;
            ctr2--;
        }

        System.out.println("-----New Array-----");
        System.out.println(Arrays.toString(newArr));
    }

    /**
     * Time Complexity O(n) - Only one traversal required
     *
     * @param input
     */
    public static void sortAppr3(int[] input) {
        int i = 0, j = 0, k = input.length - 1;

        while (j <= k) {
            if (input[j] == 0) {
                swap(input, i, j);
                i++;
                j++;
            } else if (input[j] == 1) {
                j++;
            } else if (input[j] == 2) {
                swap(input, j, k);
                k--;
            }
        }

    }

    private static void swap(int[] input, int start, int end) {
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }
}

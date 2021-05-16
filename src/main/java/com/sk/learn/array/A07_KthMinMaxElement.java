package com.sk.learn.array;

import java.util.Collections;
import java.util.PriorityQueue;


public class A07_KthMinMaxElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        findKthSmallestElement(arr, k);
        findKthHighestElement(arr, k);

        k = 5;
        findKthSmallestElement(arr, k);
        findKthHighestElement(arr, k);
    }

    /**
     * TIme complexity - O(nllogk)
     * @param arr
     * @param k
     */
    private static void findKthSmallestElement(int[] arr, int k) {
        if (arr.length < k || k <= 0) return;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            if (maxHeap.size() < k) {
                maxHeap.add(arr[i]);
            } else if (maxHeap.peek() > arr[i]) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }

        System.out.println(k + " -> smallest element is -> " + maxHeap.peek());
    }

    private static void findKthHighestElement(int[] arr, int k) {
        if (arr.length < k) return;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (maxHeap.size() < k) {
                maxHeap.add(arr[i]);
            } else if (maxHeap.peek() < arr[i]) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }

        System.out.println(k + " -> highest element is -> " + maxHeap.peek());
    }
}

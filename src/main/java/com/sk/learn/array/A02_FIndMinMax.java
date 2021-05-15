package com.sk.learn.array;

public class A02_FIndMinMax {

    public static void main(String[] args) {
        int[] input = {1, 2, 300, 4, -1};

        Pair result = findMinMax(input);

        System.out.println(result);
    }

    private static Pair findMinMax(int[] input) {
        int min = input[0];
        int max = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) min = input[i];
            if (input[i] > max) max = input[i];
        }

        Pair pair = new Pair();
        pair.min = min;
        pair.max = max;

        return pair;
    }

    static class Pair {
        int min;
        int max;

        @Override
        public String toString() {
            return "Pair{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }
    }
}

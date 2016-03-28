package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed: " + Arrays.toString(reverse));
    }

    public static int[] reverseCopy(int[] origin) {
        int[] reverse = new int[origin.length];

        for (int i = 0; i < origin.length; ++i) {
            reverse[origin.length - i - 1] = origin[i];
        }

        return reverse;
    }
}

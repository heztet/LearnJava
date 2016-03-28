package com.company;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );
        
    }

    public static int smallest(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int smallestIndex(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }

        return index;
    }

    public static int smallestIndexStartingFrom(int[] array, int index) {
        int indexOut = index;

        for (int i = index; i < array.length; i++) {
            System.out.printf("Index: %d\n", i);
            if (array[i] < array[indexOut]) {
                indexOut = i;
            }
        }

        return indexOut;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

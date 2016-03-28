package com.company;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    // Returns the smallest value in given array
    public static int smallest(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    // Returns the smallest value index in given array
    public static int smallestIndex(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }

        return index;
    }

    // Returns the smallest value index in given array starting at given index
    public static int smallestIndexStartingFrom(int[] array, int index) {
        int indexOut = index;

        for (int i = index; i < array.length; i++) {
            if (array[i] < array[indexOut]) {
                indexOut = i;
            }
        }

        return indexOut;
    }

    // Swaps two numbers in array at given indices
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Sorts a given array smallest to largest
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Swap smallest number starting at current index with current index
            swap(array, smallestIndexStartingFrom(array, i), i);
            // Print array
            System.out.println(Arrays.toString(array));
        }
    }
}

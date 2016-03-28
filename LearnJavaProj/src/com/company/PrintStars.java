package com.company;

public class PrintStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j = 0; j < x[i]; ++j) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}

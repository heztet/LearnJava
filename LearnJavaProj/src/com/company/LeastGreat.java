package com.company;

import java.util.Scanner;

public class LeastGreat {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int leastNum = least(a, b);
        int greatestNum = great(a, b);

        System.out.printf("The least of %d and %d is: %d\n", a, b, leastNum);
        System.out.printf("The greatest of %d and %d is: %d\n", a, b, greatestNum);
    }

    public static int least(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static int great(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Set up place for numbers, even, and odd
        NumberStats stats = new NumberStats();
        NumberStats evens = new NumberStats();
        NumberStats odds = new NumberStats();

        // Set up scanner
        Scanner reader = new Scanner(System.in);

        // Get numbers from user until -1 is entered
        System.out.println("Type numbers (-1 to quit):");

        int userNum = 0;
        while (userNum != -1) {
            userNum = Integer.parseInt(reader.nextLine());
            if (userNum == -1) {
                break;
            }
            stats.addNumber(userNum);
            // Add number to even or odd tracker
            if (userNum % 2 == 0) {
                evens.addNumber(userNum);
            } else {
                odds.addNumber(userNum);
            }
        }

        // Output sums of each set
        System.out.printf("Total sum: %d\n", stats.sum());
        System.out.printf("Even sum:  %d\n", evens.sum());
        System.out.printf("Odd sum:   %d\n", odds.sum());
    }
}

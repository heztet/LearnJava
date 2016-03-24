package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Asks the user for a number and tells whether it is
        // even or odd

        Scanner reader = new Scanner(System.in);

        // Get number
        System.out.print("Type a number: ");
        int userNum = Integer.parseInt(reader.nextLine());

        // Determine if even or odd
        if (userNum % 2 == 0) {
            System.out.println("Number " + userNum + " is even.");
        } else {
            System.out.println("Number " + userNum + " is odd.");
        }
    }
}

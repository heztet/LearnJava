package com.company;

import java.util.Scanner;

public class ReverseAlpha {
    public static void main(String[] args) {
        // Takes a string from the user and determines if the string is a palindrome
        Scanner reader = new Scanner(System.in);

        // Get string from user
        System.out.printf("Type a string: ");
        String userStr = reader.nextLine();

        // Get palindrome and output results
        boolean isPalin = palindrome(userStr);

        if (isPalin) {
            System.out.println("That's a palindrome!");
        } else {
            System.out.println("That's not a palindrome :<");
        }

    }

    public static boolean palindrome(String origin) {
        String reverse = new StringBuffer(origin).reverse().toString();

        if (origin.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}

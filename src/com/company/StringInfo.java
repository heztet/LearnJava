package com.company;

import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        // Take a name from the user and output various information
        Scanner reader = new Scanner(System.in);
        System.out.printf("Type your name: ");
        String userName = reader.nextLine();

        System.out.printf("Number of characters: %d\n", userName.length());
        System.out.printf("First character: %c\n", userName.charAt(0));
        System.out.printf("Last character: %c\n", userName.charAt(userName.length() - 1));


    }
}

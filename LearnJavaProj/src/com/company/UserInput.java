package com.company;

import java.util.Scanner;   // Required for user input

public class UserInput {
    public static void main(String[] args) {
        // Initialize console reader
        Scanner reader = new Scanner(System.in);

        // Read a name and print a greeting
        System.out.println("What is your name?");
        String name = reader.nextLine();
        System.out.println("Hello, " + name);

        // Use Integer.parseInt to get integer from reader String
        System.out.println("Type an integer: ");
        int userNumber = Integer.parseInt(reader.nextLine());
        System.out.println(userNumber + "+ 4 = " + (userNumber + 4));
    }
}

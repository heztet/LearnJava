package com.company;

import java.util.Scanner;

public class MultiPrint {
    // Use a user-defined method to print multiple lines
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many lines?");
        int numLines = Integer.parseInt(reader.nextLine());
        int count = 0;

        while (count < numLines) {
            printText();
            count++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}

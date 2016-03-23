package com.company;

import java.util.Scanner;

public class TwoAges {
    public static void main(String[] args) {
        // Takes in two names and ages and prints the sum
        Scanner reader = new Scanner(System.in);

        // Get first name and age
        System.out.print("Type your name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());

        System.out.println();

        // Get second name and age
        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());

        // Output results
        System.out.println();
        System.out.println(name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total.");



    }
}

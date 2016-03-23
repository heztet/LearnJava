package com.company;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        // Releases a secret phrase if input password is correct
        Scanner reader = new Scanner(System.in);

        // Loop until password is met
        while (true) {
            System.out.print("Type the password: ");
            String userPass = reader.nextLine();

            if (userPass.equals("carrot")) {
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        // Print secret
        System.out.println();
        System.out.println("The secret is: jryy qbar!");
    }
}

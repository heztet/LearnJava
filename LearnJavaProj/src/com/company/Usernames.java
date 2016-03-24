package com.company;

import java.util.Scanner;

public class Usernames {
    public static void main(String[] args) {
        // Checks that both password and username are valid

        Scanner reader = new Scanner(System.in);

        // Get username and password
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if (username.matches("alex") && password.matches("mightyducks")) {
            System.out.println("You are now logged into the system!");
        } else if (username.matches("emily") && password.matches("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}

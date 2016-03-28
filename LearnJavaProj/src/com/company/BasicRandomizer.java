package com.company;

import java.util.Random;

public class BasicRandomizer {
    // Prints 10 random integers
    public static void main(String[] args) {
        // Create a random number generator
        Random randomizer = new Random();
        int i = 0;

        while (i < 10) {
            System.out.println(randomizer.nextInt(10));
            i++;
        }
    }
}

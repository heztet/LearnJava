package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {
        // Initialize scanner and list of words
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        // Get first word
        System.out.printf("Type a word: ");
        String userWord = reader.nextLine();

        while (!userWord.isEmpty()) {
            // Add word to list
            words.add(userWord);
            // Get next word
            System.out.printf("Type a word: ");
            userWord = reader.nextLine();
        }

        // Print words in word
        for (String word : words) {
            System.out.println(word);
        }

    }
}

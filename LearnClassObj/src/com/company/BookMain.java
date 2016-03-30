package com.company;

import java.util.HashMap;

public class BookMain {
    public static void main(String[] args) {
        // Hash map examples
        Book sense = new Book("Sense and Sensibility", 1811, "...");
        Book pride = new Book("Pride and Prejudice", 1813, "...");

        HashMap<String, Book> bookCollection = new HashMap<String, Book>();
        bookCollection.put(sense.getName(), sense);
        bookCollection.put(pride.getName(), pride);

        // Equals method example
        Book book1 = new Book("Book", 2000, "...");
        Book book2 = new Book("Book", 2000, "...");

        /*
        if (book1.equals(book2)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are not equal");
        }
        */
    }
}

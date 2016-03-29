package com.company;

import java.util.HashMap;

public class BookMain {
    public static void main(String[] args) {
        Book sense = new Book("Sense and Sensibility", 1811, "...");
        Book pride = new Book("Pride and Prejudice", 1813, "...");

        HashMap<String, Book> bookCollection = new HashMap<String, Book>();
        bookCollection.put(sense.getName(), sense);
        bookCollection.put(pride.getName(), pride);
    }
}

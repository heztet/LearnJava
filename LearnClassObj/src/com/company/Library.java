package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> collection;

    // Initialize instance of Library
    public Library() {
        this.collection = new HashMap<String, Book>();
    }

    // Add book to instance
    public void addBook(Book book) {
        String name = stringCleaner(book.getName());

        if (this.collection.containsKey(name)) {
            System.out.println("This book is already in the library!");
        } else {
            collection.put(name, book);
        }
    }

    // Remove instance
    public void removeBook(String bookName) {
        bookName = stringCleaner(bookName);

        if (this.collection.containsKey(bookName)) {
            this.collection.remove(bookName);
        } else {
            System.out.println("The book was not found.");
        }
    }

    // Get book from book name
    public Book getBook(String bookName) {
        bookName = stringCleaner(bookName);
        return this.collection.get(bookName);
    }

    // Get book based on beginning characters of book name
    public Book getBookFromBeginningChars(String chars) {
        chars = stringCleaner(chars);

        for (String key : this.collection.keySet()) {
            if (key.startsWith(chars)) {
                return this.collection.get(key);
            }
        }

        return null;
    }

    // Return list of books in library
    public ArrayList<Book> bookList() {
        return new ArrayList<Book>(this.collection.values());
    }

    // Turns string into lower case and trims whitespace
    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        return string.toLowerCase().trim();
    }
}

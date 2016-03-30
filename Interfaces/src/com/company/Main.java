package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // SMS examples
        SMS message = new SMS("john", "Awesome stuff!");
        System.out.println(message.read());

        ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(new SMS("unknown number", "I hid the body"));
        printLine();

        // EBook example
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Separate the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook book = new EBook("Programming Hints.", pages);
        for (int page = 0; page < book.howManyPages(); page++) {
            System.out.println(book.read());
        }
        printLine();

        // Printer example
        SMS message2 = new SMS("teacher", "Wow, this can print!");
        ArrayList<String> pages2 = new ArrayList<String>();

        pages.add("{3, 5} are in common between {1, 3, 5} and {2, 3, 4, 5}.");
        EBook book2 = new EBook("Introduction to Mathematics.", pages);

        Printer printer = new Printer();
        printer.print(message2);
        printer.print(book2);
        printLine();

        // NumberList example
        NumberList joelList = new NumberList();
        joelList.add(new SMS("bob", "did you write the tests?"));
        joelList.add(new SMS("joe", "have you looked at the submissions?"));
        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");

        // Mike can read for
    }

    public static void printLine() {
        System.out.println("----------------------------");
    }
}

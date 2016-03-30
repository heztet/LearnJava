package com.company;

// Allows printing from multiple objects that have a readable interface
public class Printer {
    public void print(Readable readable) {
        System.out.println(readable.read());
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        NumberStats stats = new NumberStats();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(7);
        System.out.println("Amount: " + stats.amountOfNumbers());
    }
}

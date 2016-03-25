package com.company;

public class Main {

    public static void main(String[] args) {
        NumberStats stats = new NumberStats();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());
    }
}

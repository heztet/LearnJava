package com.company;

public class SecondsInYear {
    public static void main(String[] args) {
        // Calculates and returns the number of seconds in a year
        int year = 1;
        int days = year * 365;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("There are " + seconds + " seconds in a year.");
    }
}

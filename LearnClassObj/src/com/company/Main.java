package com.company;

public class Main {

    public static void main(String[] args) {
        Person bob = new Person("Bob");
        Person andy = new Person("Andy");

        // Make bob 30 years old
        int i = 0;
        while ( i < 30 ) {
            bob.becomeOlder();
            i++;
        }

        // Make andy 1 year old
        andy.becomeOlder();

        System.out.println("");

        if ( andy.isAdult() ) {
            System.out.printf("Adult: ");
            andy.printPerson();
        } else {
            System.out.printf("Minor: ");
            andy.printPerson();
        }

        if ( bob.isAdult() ) {
            System.out.printf("Adult: ");
            bob.printPerson();
        } else {
            System.out.printf("Minor: ");
            bob.printPerson();
        }
    }
}

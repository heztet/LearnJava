package com.company;

public class Main {

    public static void main(String[] args) {
        Person bob = new Person("Bob");
        Person andy = new Person("Andy");

        bob.setHeight(180);
        bob.setWeight(86);
        andy.setHeight(175);
        andy.setWeight(64);

        System.out.println(bob.getName() + ", BMI of " + bob.bodyMassIndex());
        System.out.println(andy.getName() + ", BMI of " + andy.bodyMassIndex());
    }
}

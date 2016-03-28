package com.company;

public class Main {

    public static void main(String[] args) {
        Person bob = new Person("Bob", 24);
        bob.setWeight(86);
        bob.setHeight(180);

        WeightWatchersAssociation x = new WeightWatchersAssociation(25);
        System.out.println(x.isAcceptedAsMember(bob));


    }
}

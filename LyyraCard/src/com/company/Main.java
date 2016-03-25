package com.company;

public class Main {

    public static void main(String[] args) {
        // Initialize cards for two people
        LyyraCard cardTyler = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        // Simulate day of card payments and print statuses
        cardTyler.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Tyler: " + cardTyler);
        System.out.println("Brian: " + cardBrian);

        cardTyler.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println("Tyler: " + cardTyler);
        System.out.println("Brian: " + cardBrian);

        cardTyler.payEconomical();
        cardTyler.payEconomical();
        cardBrian.loadMoney(50);

        System.out.println("Tyler: " + cardTyler);
        System.out.println("Brian: " + cardBrian);
    }
}

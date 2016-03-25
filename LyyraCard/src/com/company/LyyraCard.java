package com.company;

// Class for fictional card used to pay for meals at a college

public class LyyraCard {
    private double balance;

    // Initialize instance of LyyraCard
    public LyyraCard(double initialBalance) {
        this.balance = initialBalance;
    }

    // String representation of LyyraCard
    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    // Log payment of economical meal (2.50 euros)
    public void payEconomical() {
        this.balance -= 2.5;
    }

    // Log payment of gourmet meal (4 euros)
    public void payGourmet() {
        this.balance -= 4;
    }
}

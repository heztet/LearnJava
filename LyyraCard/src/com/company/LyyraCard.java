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
        if ( this.balance >= 2.5 ) {
            this.balance -= 2.5;
        }
    }

    // Log payment of gourmet meal (4 euros)
    public void payGourmet() {
        if ( this.balance >= 4 ) {
            this.balance -= 4;
        }
    }

    // Add money to LyyraCard (with a max of 150 euros, min of 0)
    public void loadMoney(double amount) {
        if ( amount > 150 ) {
            amount = 150;
        } else if ( amount < 0 ) {
            amount = 0;
        }
        this.balance += amount;
    }
}

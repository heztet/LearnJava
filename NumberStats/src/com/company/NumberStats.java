package com.company;

public class NumberStats {
    private int amountNums;

    public NumberStats() {
        this.amountNums = 0;
    }

    public void addNumber(int number) {
        this.amountNums += 1;
    }

    public int amountOfNumbers() {
        return this.amountNums;
    }
}

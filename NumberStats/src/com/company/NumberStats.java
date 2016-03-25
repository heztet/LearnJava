package com.company;

public class NumberStats {
    private int amountNums;
    private int sum;

    public NumberStats() {
        this.amountNums = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        sum += number;
        this.amountNums += 1;
    }

    public int amountOfNumbers() {
        return this.amountNums;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double)(this.sum) / (double)(this.amountNums);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Generate lottery numbers when created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random randomizer = new Random();

        for(int i = 0; i < 7; i++) {
            this.numbers.add(randomizer.nextInt(49) + 1);
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

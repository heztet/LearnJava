package com.company;

import java.util.ArrayList;

public class LottoNumbersMain {
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }
}

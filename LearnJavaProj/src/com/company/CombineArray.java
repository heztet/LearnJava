package com.company;

import java.util.ArrayList;

public class CombineArray {
    // Adds the elements of an array to another array using methods
    // (Demonstrates that arrays passed to methods are effected in main also
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);

        list2.add(3);
        list2.add(4);
        list2.add(5);

        combine(list1, list2);

        System.out.printf("List 1: ");
        System.out.println(list1);
        System.out.printf("List 2: ");
        System.out.println(list2);
    }

    // Adds every element in list2 to list1
    public static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int number : list2) {
            list1.add(number);
        }
    }
}

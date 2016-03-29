package com.company;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>();
        names.put("alfred", "al");
        names.put("robert", "bob");
        names.put("christopher", "chip");

        System.out.println("robert's nickname is " + names.get("robert"));
    }
}

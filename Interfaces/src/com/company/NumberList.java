package com.company;

import java.util.ArrayList;

// Each instance stores a list of objects to be read
public class NumberList {
    private ArrayList<Readable> readables;

    public NumberList() {
        this.readables = new ArrayList<Readable>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int howManyReadables() {
        return this.readables.size();
    }

    public String read() {
        String read = "";
        for (Readable readable : this.readables) {
            read += readable.read() + "\n";
        }

        this.readables.clear();
        return read;
    }
}

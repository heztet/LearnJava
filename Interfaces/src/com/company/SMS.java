package com.company;

public class SMS implements Readable {
    private String sender;
    private String content;

    // Initialize SMS
    public SMS(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    // Required for interface Readable
    public String read() {
        return this.content;
    }
}

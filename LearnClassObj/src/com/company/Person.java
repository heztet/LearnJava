package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void becomeOlder() {
        this.age = this.age + 1;
    }

    public boolean isAdult() {
        return (this.age >= 18);
    }
}

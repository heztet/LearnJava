package com.company;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    }

    // Not recommended by Java
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    // "Correct" way to return string of class instance
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    // Increase age by 1 year
    public void becomeOlder() {
        this.age = this.age + 1;
    }

    // Returns true if age >= 18
    public boolean isAdult() {
        return (this.age >= 18);
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightByHundred = this.height / 100.0;
        return this.weight / (heightByHundred * heightByHundred);
    }
}

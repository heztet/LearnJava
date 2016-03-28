package com.company;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    // Person constructor with just name
    public Person(String initialName) {
        // Run other constructor with name parameter with age of 0
        this(initialName, 0);
    }

    // Person constructor with name and age
    public Person(String initialName, int age) {
        this.name = initialName;
        this.age = age;
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
        this.becomeOlder(1);
    }

    // Increase age by argument
    public void becomeOlder(int years) {
        this.age += years;
    }

    // Returns true if age >= 18
    public boolean isAdult() {
        return (this.age >= 18);
    }

    public double weightIndex() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
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

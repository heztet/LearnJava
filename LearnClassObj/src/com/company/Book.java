package com.company;

public class Book {
    private String name;
    private String contents;
    private int publishingYear;

    public Book(String name, int publishingYear, String contents) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.contents = contents;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        // Type casting
        // (object has class Book)
        Book compared = (Book) object;
        // Publishing years must be the same
        if (this.publishingYear != compared.getPublishingYear()) {
            return false;
        }
        // Name can't be null and must be equal
        if (this.name == null || !this.name.equals(compared.getName())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.publishingYear + ")\n"
                + "Contents: " + this.contents;
    }

    // Give both properties of Book a hashCode for HashMap to work properly
    public int hashCode() {
        if (this.name == null) {
            return 7;
        }

        return this.publishingYear + this.name.hashCode();
    }
}

package org.example;

public class Book {
    private String name;
    private String author;
    private int year;
    private int edition;
    private boolean available;

    public Book(String name, String author, int year, int edition) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.available = true;
    }

    public boolean loan() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        available = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Title: " + name +
                "\nAuthor: " + author +
                "\nYear: " + year +
                "\nEdition: " + edition +
                "\nStatus: " + (available ? "Available" : "Not available") +
                "\n------------------------";
    }
}
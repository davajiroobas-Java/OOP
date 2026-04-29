package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add a book");
            System.out.println("2. Search for a book");
            System.out.println("3. List all available books");
            System.out.println("4. Return a book");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // rensa buffer

            switch (choice) {

                case 1:
                    System.out.print("Title: ");
                    String name = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();

                    System.out.print("Edition: ");
                    int edition = scanner.nextInt();
                    scanner.nextLine();

                    library.add(new Book(name, author, year, edition));
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    String search = scanner.nextLine();

                    boolean found = false;

                    for (Book b : library) {
                        if (b.getName().equalsIgnoreCase(search)) {
                            System.out.println(b);
                            found = true;

                            if (b.isAvailable()) {
                                System.out.print("Do you want to loan it? (yes/no): ");
                                String answer = scanner.nextLine();

                                if (answer.equalsIgnoreCase("yes")) {
                                    if (b.loan()) {
                                        System.out.println("Book loaned!");
                                    } else {
                                        System.out.println("Could not loan.");
                                    }
                                }
                            } else {
                                System.out.println("Book is not available.");
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nAvailable books:");
                    for (Book b : library) {
                        if (b.isAvailable()) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnName = scanner.nextLine();

                    for (Book b : library) {
                        if (b.getName().equalsIgnoreCase(returnName)) {
                            b.returnBook();
                            System.out.println("Book returned!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
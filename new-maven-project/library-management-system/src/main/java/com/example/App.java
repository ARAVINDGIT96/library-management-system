// package com.example;

// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         System.out.println("Hello, " + name + "! Welcome to Library Management System.");
//         scanner.close();
//     }
// }


package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
    String title;
    String author;
    String publisher;
    int year;

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Publisher: " + publisher + "\n" +
               "Year: " + year + "\n";
    }
}

class LibraryManagementSystem {
    private Map<String, Book> books;

    public LibraryManagementSystem() {
        books = new HashMap<>();
        books.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925));
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960));
        books.put("1984", new Book("1984", "George Orwell", "Secker & Warburg", 1949));
    }

    public String searchBook(String title) {
        if (books.containsKey(title)) {
            return books.get(title).toString();
        } else {
            return "Book not found!";
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to Library Management System.");
        
        LibraryManagementSystem library = new LibraryManagementSystem();

        System.out.print("Enter a book title to search: ");
        String searchTitle = scanner.nextLine();

        System.out.println(library.searchBook(searchTitle));
        
        scanner.close();
    }
}

package com.library.service;

import com.library.model.Book;
import java.util.HashMap;
import java.util.Map;

public class LibraryService {

    private final Map<String, Book> books;

    public LibraryService() {
        books = new HashMap<>();
        books.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925));
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960));
        books.put("1984", new Book("1984", "George Orwell", "Secker & Warburg", 1949));
    }

    public String searchBook(String title) {
        return books.getOrDefault(title, new Book("Not Found", "Unknown", "Unknown", 0)).toString();
    }
}

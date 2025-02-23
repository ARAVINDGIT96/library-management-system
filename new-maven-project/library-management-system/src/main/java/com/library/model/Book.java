package com.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")  // Ensure this table exists in H2
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String publisher;
    private int year;

    public Book() {}

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    // Getters and Setters
}

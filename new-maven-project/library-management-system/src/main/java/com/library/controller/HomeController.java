package com.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "<h1 style='color: #2E86C1;'>📚 Welcome to the Library Management System! 📚</h1>" +
               "<p>Manage your book collection, track borrow history, and discover new reads.</p>" +
               "<hr>" +
               "<h3>✨ Features ✨</h3>" +
               "<ul style='font-size: 18px;'>" +
               "<li>🔍 Search books by title, author, or genre</li>" +
               "<li>📖 View book details and availability</li>" +
               "<li>👥 Manage user accounts and borrowing history</li>" +
               "<li>📅 Track due dates and returns</li>" +
               "<li>🖥️ Integrated H2 Database Console: <a href='/h2-console'>Click Here</a></li>" +
               "</ul>" +
               "<p>Start exploring now! Search for a book at: <a href='/api/books/search?title=1984'>/api/books/search?title=1984</a></p>" +
               "<p style='font-weight: bold;'>Happy Reading! 📖✨</p>";
    }
}

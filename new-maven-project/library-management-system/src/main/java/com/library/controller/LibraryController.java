package com.library.controller;

import com.library.model.Book;
import com.library.service.LibraryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController() {
        this.libraryService = new LibraryService();
    }

    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return libraryService.searchBook(title);
    }
}

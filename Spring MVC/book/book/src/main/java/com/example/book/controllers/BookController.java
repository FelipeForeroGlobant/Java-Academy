package com.example.book.controllers;


import com.example.book.entities.Book;
import com.example.book.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add")
    public void addBook(@RequestBody Book h) {
        bookRepository.save(h);

    }


}

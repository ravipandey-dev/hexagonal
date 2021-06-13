package com.example.hexagonal.adapter;

import com.example.hexagonal.core.domain.Book;
import com.example.hexagonal.port.BookService;
import com.example.hexagonal.web.BookUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController implements BookUI {

    @Autowired
    BookService bookService;
    @Override
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @Override
    public Book getBook(@PathVariable String title) {
        return bookService.getBook(title);
    }
}

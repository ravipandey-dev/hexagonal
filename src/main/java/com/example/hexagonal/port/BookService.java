package com.example.hexagonal.port;

import com.example.hexagonal.core.domain.Book;

public interface BookService {

    public void addBook(Book book);
    public Book getBook(String title);
}

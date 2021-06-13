package com.example.hexagonal.port;

import com.example.hexagonal.core.domain.Book;

public interface BookRepo {

    public void addBook(Book book);
    public Book getBook(String title);
}

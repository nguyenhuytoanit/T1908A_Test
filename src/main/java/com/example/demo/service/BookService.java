package com.example.demo.service;

import com.example.demo.entity.BookEntity;

import java.util.List;

public interface BookService {
    List<BookEntity> getAll();
    BookEntity createBook(BookEntity p);
    List<BookEntity> getBookByName(String name);
}

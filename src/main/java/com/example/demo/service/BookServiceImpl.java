package com.example.demo.service;

import com.example.demo.entity.BookEntity;
import com.example.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

   @Autowired
    BookRepo bookRepo;

    @Override
    public List<BookEntity> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public BookEntity createBook(BookEntity p) {
        return bookRepo.save(p);
    }

    @Override
    public List<BookEntity> getBookByName(String name) {
        List<BookEntity> list = bookRepo.findBookByName(name);
        return list;
    }
}

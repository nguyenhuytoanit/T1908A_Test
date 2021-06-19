package com.example.demo.repository;

import com.example.demo.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<BookEntity, Integer> {
    @Query("select p from BookEntity p where p.name like %:name%")
    List<BookEntity> findBookByName(String name);

}

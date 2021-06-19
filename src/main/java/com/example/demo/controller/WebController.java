package com.example.demo.controller;

import com.example.demo.entity.BookEntity;
import com.example.demo.entity.PublisherEntity;
import com.example.demo.service.BookService;
import com.example.demo.service.PublishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    BookService bookService;

    @Autowired
    PublishingService publishingService;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        List<BookEntity> books = bookService.getAll();
        System.out.println(books);
        model.addAttribute("books", books);
        return "ListBook";
    }

    @GetMapping({"/add-book"})
    public String AddProduct(Model model){
        List<PublisherEntity> publishers = publishingService.getAllPublishing();
        model.addAttribute("publishers", publishers);
        return "AddBook";
    }

    @GetMapping({"/listPublishing"})
    public String listPublishing(Model model){
        List<PublisherEntity> publishers = publishingService.getAllPublishing();
        model.addAttribute("publishers", publishers);
        return "ListPublishing";
    }

    @GetMapping({"/addPublishing"})
    public String addPublishing(){
        return "addPublishing";
    }

    @PostMapping("/addBook")
    public String addStudent(Model model, @ModelAttribute BookEntity bookEntity) {
        bookService.createBook(bookEntity);
        return "redirect:/index";
    }

    @PostMapping("/addPublishing")
    public String addPublishing(Model model, @ModelAttribute PublisherEntity publisherEntity) {
        publishingService.createPublishing(publisherEntity);
        return "redirect:/index";
    }
}

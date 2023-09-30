package com.librosantigal.db.stock.controllers;

import com.librosantigal.db.stock.dtos.BookDTO;
import com.librosantigal.db.stock.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<BookDTO> readAll(){
        return bookService.readAll();
    }

}

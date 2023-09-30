package com.librosantigal.db.stock.services;

import com.librosantigal.db.stock.dtos.BookDTO;
import com.librosantigal.db.stock.models.Book;

import java.util.List;

public interface BookService {

    // CREATE
    void create(Book book);

    // READ
    List<BookDTO> readAll();
}

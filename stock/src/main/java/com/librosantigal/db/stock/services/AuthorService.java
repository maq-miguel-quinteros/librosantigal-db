package com.librosantigal.db.stock.services;

import com.librosantigal.db.stock.dtos.AuthorDTO;
import com.librosantigal.db.stock.models.Author;

import java.util.List;

public interface AuthorService {

    // CREATE
    void create(Author author);

    // READ
    List<AuthorDTO> readAll();
}

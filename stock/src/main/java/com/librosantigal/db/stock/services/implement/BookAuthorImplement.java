package com.librosantigal.db.stock.services.implement;

import com.librosantigal.db.stock.models.BookAuthor;
import com.librosantigal.db.stock.repositories.BookAuthorRepository;
import com.librosantigal.db.stock.services.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAuthorImplement implements BookAuthorService {

    @Autowired
    BookAuthorRepository bookAuthorRepository;

    @Override
    public void create(BookAuthor bookAuthor) {
        bookAuthorRepository.save(bookAuthor);
    }
}

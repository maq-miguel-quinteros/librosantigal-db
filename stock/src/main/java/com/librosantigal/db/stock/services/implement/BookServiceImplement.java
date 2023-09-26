package com.librosantigal.db.stock.services.implement;

import com.librosantigal.db.stock.dtos.BookDTO;
import com.librosantigal.db.stock.models.Book;
import com.librosantigal.db.stock.repositories.BookRepository;
import com.librosantigal.db.stock.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImplement implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<BookDTO> readAll() {
        return bookRepository.findAll().stream()
                .map(book -> new BookDTO(book))
                .collect(Collectors.toList());
    }
}

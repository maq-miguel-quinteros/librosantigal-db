package com.librosantigal.db.stock.dtos;

import com.librosantigal.db.stock.models.Book;

import java.time.LocalDate;

public class BookDTO {

    private Long id;
    private String isbn;
    private String title;
    private LocalDate date;
    private String synopsis;

    public BookDTO() {
    }
    public BookDTO(Book book) {
        this.id = book.getId();
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.date = book.getDate();
        this.synopsis = book.getSynopsis();
    }

    public Long getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getSynopsis() {
        return synopsis;
    }
}

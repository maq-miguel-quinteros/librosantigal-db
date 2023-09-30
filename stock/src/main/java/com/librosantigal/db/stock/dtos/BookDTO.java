package com.librosantigal.db.stock.dtos;

import com.librosantigal.db.stock.models.Book;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class BookDTO {

    private Long id;
    private String isbn;
    private String title;
    private LocalDate date;
    private String synopsis;
    private int pagesNumber;
    private Set<BookAuthorDTO> authors;

    public BookDTO() {
    }
    public BookDTO(Book book) {
        this.id = book.getId();
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.date = book.getDate();
        this.synopsis = book.getSynopsis();
        this.pagesNumber = book.getPagesNumber();

        this.authors = book.getAuthors().stream()
                .map(bookAuthor -> new BookAuthorDTO(bookAuthor))
                .collect(Collectors.toSet());
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

    public Set<BookAuthorDTO> getAuthors() {
        return authors;
    }
}

package com.librosantigal.db.stock.dtos;

import com.librosantigal.db.stock.models.BookAuthor;

import java.time.LocalDate;

public class BookAuthorDTO {

    private Long id;
    private String author_name;
    private String author_lastName;
    private LocalDate author_birthdate;
    private LocalDate author_deathDate;

    public BookAuthorDTO() {
    }

    public BookAuthorDTO(BookAuthor bookAuthor) {
        this.id = bookAuthor.getId();
        this.author_name = bookAuthor.getAuthor().getName();
        this.author_lastName = bookAuthor.getAuthor().getLastName();
        this.author_birthdate = bookAuthor.getAuthor().getBirthdate();
        this.author_deathDate = bookAuthor.getAuthor().getDeathDate();
    }

    public Long getId() {
        return id;
    }
    public String getAuthor_name() {
        return author_name;
    }
    public String getAuthor_lastName() {
        return author_lastName;
    }
    public LocalDate getAuthor_birthdate() {
        return author_birthdate;
    }
    public LocalDate getAuthor_deathDate() {
        return author_deathDate;
    }
}

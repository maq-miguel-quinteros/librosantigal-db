package com.librosantigal.db.stock.dtos;

import com.librosantigal.db.stock.models.Author;

import java.time.LocalDate;

public class AuthorDTO {

    private Long id;
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private LocalDate deathDate;

    public AuthorDTO() {
    }
    public AuthorDTO(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.lastName = author.getLastName();
        this.birthdate = author.getBirthdate();
        this.deathDate = author.getDeathDate();
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public LocalDate getDeathDate() {
        return deathDate;
    }
}

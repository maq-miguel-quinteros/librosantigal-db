package com.librosantigal.db.stock.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private LocalDate deathDate;

    /** agregar country como un dato de set o parecido */

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private Set<BookAuthor> books = new HashSet<>();

    public Author() {
    }

    public Author(String name, String lastName, LocalDate birthdate, LocalDate deathDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.deathDate = deathDate;
    }

    public void addBookAuthor(BookAuthor bookAuthor){
        bookAuthor.setAuthor(this);
        books.add(bookAuthor);
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public LocalDate getDeathDate() {
        return deathDate;
    }
    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }
    public Set<BookAuthor> getBooks() {
        return books;
    }
    public void setBooks(Set<BookAuthor> books) {
        this.books = books;
    }
}

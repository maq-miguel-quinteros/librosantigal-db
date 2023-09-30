package com.librosantigal.db.stock.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;
    private String isbn;
    private String title;
    private LocalDate date;
    @Lob
    private String synopsis;
    private int pagesNumber;
    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
    private Set<BookAuthor> authors = new HashSet<>();

    /** atributos a sumar
     * nro paginas, idioma */

    public Book() {}
    public Book(String isbn, String title, LocalDate date ,String synopsis, int pagesNumber) {
        this.isbn = isbn;
        this.title = title;
        this.date = date;
        this.synopsis = synopsis;
        this.pagesNumber = pagesNumber;
    }

    public void addBookAuthor(BookAuthor bookAuthor){
        bookAuthor.setBook(this);
        authors.add(bookAuthor);
    }

    public Long getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public int getPagesNumber() {
        return pagesNumber;
    }
    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
    public Set<BookAuthor> getAuthors() {
        return authors;
    }
    public void setAuthors(Set<BookAuthor> authors) {
        this.authors = authors;
    }
}

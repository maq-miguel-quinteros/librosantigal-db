package com.librosantigal.db.stock;

import com.fasterxml.jackson.datatype.jsr310.deser.key.LocalDateTimeKeyDeserializer;
import com.librosantigal.db.stock.models.Author;
import com.librosantigal.db.stock.models.Book;
import com.librosantigal.db.stock.models.BookAuthor;
import com.librosantigal.db.stock.services.AuthorService;
import com.librosantigal.db.stock.services.BookAuthorService;
import com.librosantigal.db.stock.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;


@SpringBootApplication
public class StockApplication {

    @Autowired
    BookService bookService;
    @Autowired
    AuthorService authorService;

    @Autowired
    BookAuthorService bookAuthorService;

    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData() {
        return (args -> {
            Book book01 = new Book("9788466619523", "A través del tiempo", LocalDate.of(2018, 11, 22),
                    "El doctor Brian Weiss, analiza en este libro la capacidad de curación de la terapia de regresión a vidas pasadas.",
                    240);
            bookService.create(book01);

            Author author01 = new Author("Brian", "Weiss", LocalDate.of(1994, 11, 6), null);
            authorService.create(author01);

            BookAuthor bookAuthor01 = new BookAuthor();
            book01.addBookAuthor(bookAuthor01);
            author01.addBookAuthor(bookAuthor01);
            bookAuthorService.create(bookAuthor01);

            /** *********************************************************** */

            Book book02 = new Book("9789875505681", "Los Miserables", LocalDate.of(2010, 07, 02),
                    "Es la historia de Jean Valjean, un convicto que estuvo injustamente encarcelado por 19 años por haberse robado una rebanada de pan. Al ser liberado de su injusta condena, Valjean trata de escapar de su pasado, lleno de maldad y depravación, para vivir una vida digna y honesta. Sin embargo, esto se ve truncado al ser reconocido por el inspector Javert, quien lo persigue obsesionadamente para enviarlo de nuevo a prisión. Esta persecución consume la vida de ambos hombres, terminando en un inesperado desenlace.",
                    1090);
            bookService.create(book02);

            Author author02 = new Author("Victor", "Hugo", LocalDate.of(1802, 2, 26), LocalDate.of(1885, 5, 22));
            authorService.create(author02);

            BookAuthor bookAuthor02 = new BookAuthor();
            book02.addBookAuthor(bookAuthor02);
            author02.addBookAuthor(bookAuthor02);
            bookAuthorService.create(bookAuthor02);

            /** *********************************************************** */

            Book book03 = new Book("9788416788712", "La Bolsa o la Vida", LocalDate.of(1992, 9, 01),
                    "El libro definitivo para dejar de ser esclavo del dinero y mejorar tu vida. Hazte las siguientes preguntas: ¿Tienes bastante dinero? ¿Pasas suficiente tiempo con tu familia y amigos? ¿Vuelves a casa del trabajo lleno de energía? ¿Tienes una vida completa y estás satisfecho? Si has respondido que no a alguna de estas preguntas, este libro es para ti. Vicki Robin ofrece en La bolsa o la vida un programa de nueve pasos con el que descubrirás el valor real de tu tiempo, transformarás tu relación con el dinero, aprenderás a simplificar y a vivir bien gastando menos y, además, recuperarás el control de tu vida. «Este libro te cambiará la vida.» OPRAH WINFREY",
                    360);
            bookService.create(book03);

            Author author03 = new Author("Vicki", "Robin", LocalDate.of(1945, 7, 6), null);
            authorService.create(author03);
            Author author04 = new Author("Joe", "Domínguez", LocalDate.of(1938, 2, 2), LocalDate.of(1997, 1, 11));
            authorService.create(author04);

            BookAuthor bookAuthor03 = new BookAuthor();
            book03.addBookAuthor(bookAuthor03);
            author03.addBookAuthor(bookAuthor03);
            bookAuthorService.create(bookAuthor03);

            BookAuthor bookAuthor04 = new BookAuthor();
            book03.addBookAuthor(bookAuthor04);
            author04.addBookAuthor(bookAuthor04);
            bookAuthorService.create(bookAuthor04);
        });
    }
}
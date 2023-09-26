package com.librosantigal.db.stock;

import com.fasterxml.jackson.datatype.jsr310.deser.key.LocalDateTimeKeyDeserializer;
import com.librosantigal.db.stock.models.Book;
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

    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData() {
        return (args -> {
            Book book01 = new Book("9788466619523", "A través del tiempo", LocalDate.of(2018, 11, 22), "El doctor Brian Weiss, analiza en este libro la capacidad de curación de la terapia de regresión a vidas pasadas.");
            bookService.createBook(book01);

            Book book02 = new Book("9789875505681", "Los Miserables", LocalDate.of(2010, 07, 02),"Es la historia de Jean Valjean, un convicto que estuvo injustamente encarcelado por 19 años por haberse robado una rebanada de pan. Al ser liberado de su injusta condena, Valjean trata de escapar de su pasado, lleno de maldad y depravación, para vivir una vida digna y honesta. Sin embargo, esto se ve truncado al ser reconocido por el inspector Javert, quien lo persigue obsesionadamente para enviarlo de nuevo a prisión. Esta persecución consume la vida de ambos hombres, terminando en un inesperado desenlace.");
            bookService.createBook(book02);
        });
    }
}
package com.librosantigal.db.stock.repositories;

import com.librosantigal.db.stock.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends JpaRepository <Book, Long>{
}

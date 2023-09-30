package com.librosantigal.db.stock.repositories;

import com.librosantigal.db.stock.models.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookAuthorRepository extends JpaRepository <BookAuthor, Long> {
}

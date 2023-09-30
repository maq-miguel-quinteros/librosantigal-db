package com.librosantigal.db.stock.repositories;

import com.librosantigal.db.stock.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends JpaRepository <Author, Long> {
}

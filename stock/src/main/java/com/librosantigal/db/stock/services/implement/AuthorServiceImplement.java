package com.librosantigal.db.stock.services.implement;

import com.librosantigal.db.stock.dtos.AuthorDTO;
import com.librosantigal.db.stock.models.Author;
import com.librosantigal.db.stock.repositories.AuthorRepository;
import com.librosantigal.db.stock.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorServiceImplement implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    @Override
    public void create(Author author) {
        authorRepository.save(author);
    }

    @Override
    public List<AuthorDTO> readAll() {
        return authorRepository.findAll().stream()
                .map(author -> new AuthorDTO(author))
                .collect(Collectors.toList());
    }
}

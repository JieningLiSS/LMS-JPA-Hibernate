package com.ss.lmshibernate.controller;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.ss.lmshibernate.exception.ResourceNotFoundException;

import com.ss.lmshibernate.entity.Author;

import com.ss.lmshibernate.repository.AuthorRepository;


@RestController
@RequestMapping("/lms")
public class AuthorController<X> {  
    @Autowired
     AuthorRepository authorRepository;

    @GetMapping("/authors")
    public Page<Author> getAllAuthors(Pageable pageable) {
        return authorRepository.findAll(pageable);
    }

    @PostMapping("/authors")
    public Author createAuthor(@Valid @RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("/authors/{authorId}")
    public Author updateAuthor(@PathVariable Long authorId, @Valid @RequestBody Author authorRequest) {
        return authorRepository.findById(authorId).map(author -> {
        	author.setAuthorName(authorRequest.getAuthorName());
            return authorRepository.save(author);
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + authorId + " not found"));
    }


    @DeleteMapping("/authors/{authorId}")
    public ResponseEntity<?> deleteAuthor(@PathVariable Long authorId) {
        return authorRepository.findById(authorId).map(author -> {
        	authorRepository.delete(author);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("AuthorId " + authorId + " not found"));
    }

}

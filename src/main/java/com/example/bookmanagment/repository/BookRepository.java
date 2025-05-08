package com.example.bookmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmanagment.entity.Book;

// Because we extend JpaRepository already annotated as repository we dont need to annotate again
// Also by default they are transactional we dont have to add transactional annotation in a service layer to make the methods transactional
//transactional annotation define the boundaries of a transaction, ensuring that a series of operations either complete successfully or are rolled back in case of an error
public interface BookRepository extends JpaRepository<Book,Long> {

}

package com.example.bookmanagment.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmanagment.dto.BookDto;
import com.example.bookmanagment.service.BookService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController//Capable of handlinh http request
@RequestMapping("/api/books")//To define base url
@AllArgsConstructor
public class BookController {

    private BookService bookService;

    // Create Book REST API
    @PostMapping//map incoming post request to this method
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto){// this annoation will extract the json from the http request and it will convert json into bookDto
        BookDto savedBook = bookService.createBook(bookDto);
        return new ResponseEntity<>(savedBook,HttpStatus.CREATED);
    }

    // Get Book REST API 
    @GetMapping("{id}")//to map the incoming http get request , this id called URI
    public ResponseEntity<BookDto> getBookById(@PathVariable("id") Long Bookid){// @pathvariable to bind the value of URI to this method argument
        BookDto book = bookService.getBookById(Bookid);
        return ResponseEntity.ok(book);
    }

    // Get All Books REST API
    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        List<BookDto> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    // Update Book By Id REST API
    // Put Method used to replace item
    @PutMapping("{id}")
    public ResponseEntity<BookDto> UpdateBookById(@PathVariable("id") Long bookId,// to bind the value of URI variable to method argument
    @RequestBody BookDto updatedBook )// to extract updated json from the request an it will convert json into dto
    {
        BookDto book = bookService.updateBook(bookId, updatedBook);
        return ResponseEntity.ok(book);
        
        
    }

    //Delete Book By Id REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String>DeleteBookById(@PathVariable("id") Long bookId){
        bookService.deleteBook(bookId);
        return ResponseEntity.ok("Book deleted");
    }
    



}

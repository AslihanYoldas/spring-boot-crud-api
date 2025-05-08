package com.example.bookmanagment.service;

import java.util.List;

import com.example.bookmanagment.dto.BookDto;

public interface BookService {

    BookDto createBook(BookDto bookDto);

    BookDto getBookById(Long bookId);

    List<BookDto> getAllBooks();

    BookDto updateBook(Long bookId, BookDto updatedBookDto);

    void deleteBook(Long bookId);


}

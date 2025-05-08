package com.example.bookmanagment.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.example.bookmanagment.dto.BookDto;
import com.example.bookmanagment.entity.Book;
import com.example.bookmanagment.exception.ResourceNotFoundException;
import com.example.bookmanagment.mapper.BookMapper;
import com.example.bookmanagment.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookServiceImpl  implements BookService{

    private BookRepository bookRepository;

    @Override
    public BookDto createBook(BookDto bookDto) {

        Book book = BookMapper.mapToBookEntity(bookDto);
        Book savedBook = bookRepository.save(book);
        return BookMapper.mapToBookDto(savedBook);
    }

    @Override
    public BookDto getBookById(Long bookId) {
        Book book = bookRepository.findById(bookId)
        .orElseThrow(()->new ResourceNotFoundException("Book not found with given Id : " + bookId));
        return  BookMapper.mapToBookDto(book);
    
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map((book)-> BookMapper.mapToBookDto(book))
        .collect(Collectors.toList());
        
    }

    @Override
    public BookDto updateBook(Long bookId, BookDto updatedBookDto) {
        Book book = bookRepository.findById(bookId).orElseThrow(
            () -> new ResourceNotFoundException("Book not found with give id:" + bookId)
        );

        book.setName(updatedBookDto.getName());
        book.setAuthorName(updatedBookDto.getAuthorName());
        book.setPrice(updatedBookDto.getPrice());

        //In the context of JPA (Java Persistence API) or Spring Data JPA, the save method behaves as follows:
        // If the entity (in this case, the book) has an ID that already exists in the database, it performs an update operation.
        // If the entity does not have an ID (or has a new ID that does not exist in the database), it performs an insert operation, creating a new record.
        Book updatedBook = bookRepository.save(book);
        return BookMapper.mapToBookDto(updatedBook);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.findById(bookId).orElseThrow(()-> new ResourceNotFoundException("Book not found with give id:" + bookId));
        bookRepository.deleteById(bookId);
    }
    

}

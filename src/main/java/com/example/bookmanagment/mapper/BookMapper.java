package com.example.bookmanagment.mapper;

import com.example.bookmanagment.dto.BookDto;
import com.example.bookmanagment.entity.Book;

// To map book entity to book dto and book dto to book entity
// we need to convert between dto and jpa entity
// Instead of writing same logic in all the classes create a mapper class keep the common logic
public class BookMapper {

    // Takes jpa book entity and converts it into book dto to send to rest api
    public static BookDto mapToBookDto(Book book){
        return new BookDto(
            book.getId(),
            book.getName(),
            book.getAuthorName(),
            book.getPrice()

        );
    }
        //takes dto from rest api converts to jpa entity for the database
        public static Book mapToBookEntity(BookDto bookDto){
            return new Book(
                bookDto.getId(),
                bookDto.getName(),
                bookDto.getAuthorName(),
                bookDto.getPrice()
    
            );
        
    }

}

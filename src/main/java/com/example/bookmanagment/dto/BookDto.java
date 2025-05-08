package com.example.bookmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// DTO -- DATA TRANSFER OBJECT
// dto used to transfer data between software application subsystems or layers, particularly in the context of web applications and APIs.
// We use this class the transfer the data between client and server
// rest services will use this class as a response
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Long id;
    private String name;
    private String authorName;
    private Double price;

}


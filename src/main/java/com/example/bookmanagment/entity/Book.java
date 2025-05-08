package com.example.bookmanagment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity//to make a JPA entity
@Table(name="Book")
public class Book {

    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment value
    private Long id;

    // with column annotation we can change the column name in the database and add constraints
    private String name;
    @Column(name = "author_name",nullable = false)
    private String authorName;
    private Double price;

}

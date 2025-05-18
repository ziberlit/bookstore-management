package com.leonid.bookstore_management.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String isbn;
    @ManyToMany
    private List<Author> authors;
}

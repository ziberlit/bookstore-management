package com.leonid.bookstore_management.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "authors")
@Data
public class Author {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String biography;
    @ManyToOne
    private Publisher publisher;
}

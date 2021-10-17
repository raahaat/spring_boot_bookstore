package com.example.Bookstore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title" , nullable = false, length = 100)
    private String title;

    @Column(name = "description" , nullable = false, length = 250)
    private String description;

    @Column(name = "author" , nullable = false, length = 250)
    private String author;

    @Column(name = "price" , nullable = false)
    private Double price;

    @Column(name = "create_time" , nullable = false)
    private  LocalDateTime createTime;
}

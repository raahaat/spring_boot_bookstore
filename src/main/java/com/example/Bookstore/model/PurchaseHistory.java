package com.example.Bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "purchase_history")
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "book_id", nullable = false)
    private int bookId;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_date", nullable = false)
    private LocalDateTime purchaseDate;
}

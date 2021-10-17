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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username" , nullable = false, length = 100)
    private String userName;

    @Column(name = "password" , nullable = false, length = 100)
    private  String password;

    @Column(name = "name" , nullable = false, length = 100)
    private String name;

    @Column(name = "create_time" , nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role" , nullable = false)
    private Role role;

}

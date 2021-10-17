package com.example.Bookstore.repository;

import com.example.Bookstore.model.Role;
import com.example.Bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {


//    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role=:role where username=:username")
    void updateUser(@Param("role")Role role, @Param("username") String username);
}

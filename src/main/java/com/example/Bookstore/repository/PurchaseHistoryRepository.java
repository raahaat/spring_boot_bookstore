package com.example.Bookstore.repository;

import com.example.Bookstore.model.PurchaseHistory;
import com.example.Bookstore.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Integer> {

    @Query("select "+
            "b.title as title, ph.price as price, ph.purchaseDate as purchase_time "+
            "from PurchaseHistory ph left join Book b on b.id = ph.bookId " +
            "where ph.userId =:userId")
    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") int userId);
}

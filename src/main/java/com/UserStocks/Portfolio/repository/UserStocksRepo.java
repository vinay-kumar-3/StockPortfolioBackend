package com.UserStocks.Portfolio.repository;

import com.UserStocks.Portfolio.model.UserStocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserStocksRepo extends JpaRepository<UserStocks, Integer> {
    UserStocks findByStockSymbol(String stockSymbol);
    @Modifying
    @Query("DELETE FROM UserStocks u WHERE u.stockSymbol = :stockSymbol")
    void deleteUserStocksByStockSymbol(String stockSymbol);
}
package com.UserStocks.Portfolio.services.impl;

import com.UserStocks.Portfolio.model.UserStocks;
import com.UserStocks.Portfolio.repository.UserStocksRepo;
import com.UserStocks.Portfolio.services.UserStocksServices;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserStocksImpl implements UserStocksServices {

    UserStocksRepo userStocksRepo;

    public UserStocksImpl(UserStocksRepo userStocksRepo) {
        this.userStocksRepo = userStocksRepo;
    }

    @Override
    public UserStocks getUserStock(String stockSymbol){

        return userStocksRepo.findByStockSymbol(stockSymbol);
    }

    @Override
    public String addUserStock(UserStocks userStock){
        userStocksRepo.save(userStock);
        return "Stock added successfully";
    }

    @Override
    public String updateUserStock(UserStocks userStock){
        userStocksRepo.save(userStock);
        return "User Stock Updated";
    }

    @Override
    @Transactional
    public String deleteUserStock(String stockSymbol) {
        userStocksRepo.deleteUserStocksByStockSymbol(stockSymbol);
        return "User Stock Deleted";
    }

    @Override
    public List<UserStocks> getUserAllStocks(){
        return userStocksRepo.findAll();
    }
}
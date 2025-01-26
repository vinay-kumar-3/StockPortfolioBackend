package com.UserStocks.Portfolio.controller;

import com.UserStocks.Portfolio.model.UserStocks;
import com.UserStocks.Portfolio.services.UserStocksServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userstocks")
@CrossOrigin("*")
public class UserStocksAPI {

    UserStocksServices userStocksServices;

    public UserStocksAPI(UserStocksServices userStocksServices) {
        this.userStocksServices = userStocksServices;
    }

    @GetMapping("{stockSymbol}")
    public UserStocks getUserStocksDetails(@PathVariable("stockSymbol") String stockSymbol) {
        return userStocksServices.getUserStock(stockSymbol);
    }

    @PostMapping
    public String addUserStock(@RequestBody UserStocks userStock) {
        return userStocksServices.addUserStock(userStock);
    }

    @PutMapping
    public String updateUserStock(@RequestBody UserStocks userStock) {
        return userStocksServices.updateUserStock(userStock);
    }

    @DeleteMapping("{stockSymbol}")
    public String deleteUserStock(@PathVariable("stockSymbol") String stockSymbol) {
        return userStocksServices.deleteUserStock(stockSymbol);
    }

    @GetMapping()
    public List<UserStocks> getAllUserStocks() {
        return userStocksServices.getUserAllStocks();
    }
}
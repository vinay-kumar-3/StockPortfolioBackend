package com.UserStocks.Portfolio.services;

import com.UserStocks.Portfolio.model.UserStocks;
import java.util.List;

public interface UserStocksServices {

    public UserStocks getUserStock(String stockSymbol);
    public String addUserStock(UserStocks userStock);
    public String updateUserStock(UserStocks userStock);
    public String deleteUserStock(String stockSymbol);
    public List<UserStocks> getUserAllStocks();
}
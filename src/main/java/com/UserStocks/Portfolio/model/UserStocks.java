package com.UserStocks.Portfolio.model;

import jakarta.persistence.*;


@Entity
@Table(name="user_stocks_info")
public class UserStocks {

    @Column(name = "stock_name", nullable = false)
//    @NotNull(message = "Stock name cannot be null")
    private String stockName;

    @Id
    @Column(name = "stock_symbol", nullable = false)
    private String stockSymbol;

    @Column(name = "stock_exchange", nullable = false)
    private String stockExchange;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "stock_price", nullable = false)
    private float stockPrice;


    public UserStocks() {
    }

    public UserStocks( String stockName, String stockSymbol, String stockExchange, int quantity, float stockPrice) {

        this.stockName = stockName;
        this.stockSymbol = stockSymbol;
        this.stockExchange = stockExchange;
        this.quantity = quantity;
        this.stockPrice = stockPrice;
    }


    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
    }
}
package com.stock;

public class StockMain {
    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.calculateEachStock();
        StockAccount stockAccount = new StockAccount();
    }
}

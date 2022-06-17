package com.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    int numberOfStock;
    private String shareName;
    private double sharePrice;
    private int numberOfShare;

    List<Stock> stockList = new ArrayList<>();

    public double getSharePrice(){
        return sharePrice;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public String getShareName() {
        return shareName ;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "shareName='" + shareName + '\'' +
                ", sharePrice=" + sharePrice +
                ", numberOfShare=" + numberOfShare +
                '}';
    }
}



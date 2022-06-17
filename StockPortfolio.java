package com.stock;

import java.util.Scanner;

public class StockPortfolio {

    public void calculateEachStock() {
   Scanner scanner = new Scanner(System.in);
    System.out.println("Enter share name");
    String shareName = scanner.next();

    System.out.println("Enter share price");
    double sharePrice = scanner.nextInt();

    System.out.println("Enter number of share");
    int numberOfShare = scanner.nextInt();

    Stock stock = new Stock();
    stock.setShareName(shareName);
    stock.setNumberOfShare(numberOfShare);
    stock.setSharePrice(sharePrice);

    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Enter share name");
    String shareName1 = scanner1.next();

    System.out.println("Enter share price");
    int sharePrice1 = scanner1.nextInt();

    System.out.println("Enter number of share");
    int numberOfShare1 = scanner1.nextInt();

   System.out.println("Share name is "+shareName);
   System.out.println("Share price is "+sharePrice);
   System.out.println("Number of share is "+numberOfShare);

   double valueOfStock = numberOfShare*sharePrice;

   System.out.println("value of stock "+valueOfStock);

    Stock stock1 = new Stock();
    stock1.setShareName(shareName1);
    stock1.setNumberOfShare(numberOfShare1);
    stock1.setSharePrice(sharePrice1);

    System.out.println("Share name is "+shareName1);
    System.out.println("Share price is "+sharePrice1);
    System.out.println("Number of share is "+numberOfShare1);

    double valueOfStock1 = numberOfShare1*sharePrice1;

    System.out.println("value of stock "+valueOfStock1);

    stock.stockList.add(stock);
    stock.stockList.add(stock1);
    System.out.println("List of stocks"+stock.stockList);
    double totalStock = valueOfStock1 + valueOfStock1;
    System.out.println("Total stock price : "+totalStock);
}
}

package com.burak.demo.model;

import java.math.BigDecimal;

public class ProductDetails {
    private String id;
    private String name;
    private int stocksAvailable;
    private BigDecimal singlePrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStocksAvailable() {
        return stocksAvailable;
    }

    public void setStocksAvailable(int stocksAvailable) {
        this.stocksAvailable = stocksAvailable;
    }

    public BigDecimal getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(BigDecimal singlePrice) {
        this.singlePrice = singlePrice;
    }
}

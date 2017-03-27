package com.burak.demo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductDetails {

    private String id;
    private String name;
    private int stocksAvailable;
    private BigDecimal singlePrice;

    public ProductDetails(String id, String name, int stocksAvailable, BigDecimal singlePrice) {
        this.id = id;
        this.name = name;
        this.stocksAvailable = stocksAvailable;
        this.singlePrice = singlePrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStocksAvailable() {
        return stocksAvailable;
    }

    public BigDecimal getSinglePrice() {
        return singlePrice;
    }
}

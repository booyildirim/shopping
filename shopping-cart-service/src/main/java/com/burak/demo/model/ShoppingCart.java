package com.burak.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private BigDecimal totalPrice;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item it) {
        items.add(it);
    }

    public List<Item> getItems() {
        return items;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}

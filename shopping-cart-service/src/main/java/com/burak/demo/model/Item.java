package com.burak.demo.model;

import java.util.Date;

public class Item {
    private String id;
    private int quantity;
    private String aliasName;
    private Date addedAt;

    public Item(String id, int quantity, String aliasName) {
        this.id = id;
        this.quantity = quantity;
        this.aliasName = aliasName;
        this.addedAt = new Date();
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAliasName() {
        return aliasName;
    }

    public Date getAddedAt() {
        return addedAt;
    }
}

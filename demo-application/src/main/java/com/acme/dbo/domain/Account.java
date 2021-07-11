package com.acme.dbo.domain;

import java.math.BigDecimal;

public class Account {
    private int id;
    private BigDecimal amount;

    public Account() {
    }

    public Account(int id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account " + getId() + " : " + getAmount();
    }
}

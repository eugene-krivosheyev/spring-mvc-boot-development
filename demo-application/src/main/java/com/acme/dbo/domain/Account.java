package com.acme.dbo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonPropertyOrder({ "amount", "id" })
public class Account {
    private int id;
    private BigDecimal amount;

    public Account() {
    }

    public Account(int id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    @PositiveOrZero
    public int getId() {
        return id;
    }

    @NotNull
    @Digits(integer = 20, fraction = 2)
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

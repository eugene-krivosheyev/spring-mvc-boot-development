package com.acme.dbo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.Objects;

public class BankClient {
    private int id;
    private String name;


    public BankClient() {
    }

    public BankClient(int id, String name){
        this.id = id;
        this.name = name;
    }
    @PositiveOrZero
    public int getId() {
        return id;
    }
    @NotNull
    public String getName(){
       return name;
    }

    public void setId(int id) {
        this.id=id;
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

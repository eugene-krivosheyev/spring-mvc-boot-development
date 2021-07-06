package com.dbo.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public Client(int id, String name) {
        this.id = id;
        this.name = name;
        accounts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    public List<Integer> getAccounts() {
        return accounts;
    }

    private List<Integer> accounts;

    @Override
    public String toString() {
        return "Client{id=" + id + ", name=" + name + "}";
    }
}

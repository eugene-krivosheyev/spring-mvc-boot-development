package com.acme.dbo.domain;

public class Client {
    private int id;
    private Account account;

    public Client(Account account) {
        this.account = account;
    }

    public Client(int id, Account account) {
        this.id = id;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", account=" + account +
                '}';
    }
}

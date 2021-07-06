package com.acme.dbo;

public class MyClient {
    private int id;

    public MyClient(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Client " + getId();
    }
}

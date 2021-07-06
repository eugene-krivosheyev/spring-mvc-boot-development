package com.acme.dbo;

import java.math.BigDecimal;
import java.util.Collection;

public class ClientService {
    private final ClientRepository accounts = new MapBackedClientRepository();

    public MyClient create(int Id) {
        return clients.create(new MyClient(Id));
    }

    public MyClient findById(Integer id) {
        return accounts.findById(id);
    }

    public Collection<MyClient> findAll() {
        return accounts.findAll();
    }
}

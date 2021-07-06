package com.acme.dbo.service;

import com.acme.dbo.dao.ClientRepository;
import com.acme.dbo.domain.Account;
import com.acme.dbo.domain.Client;

import java.math.BigDecimal;
import java.util.Collection;

public class ClientService {
    private final ClientRepository clients;

    public ClientService(ClientRepository clients) {
        this.clients = clients;
    }

    public Client create(Account account) {
        return clients.create(new Client(account));
    }

    public Client findById(Integer id) {
        return clients.findById(id);
    }

    public Collection<Client> findAll() {
        return clients.findAll();
    }
}

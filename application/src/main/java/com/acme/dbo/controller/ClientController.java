package com.acme.dbo.controller;

import com.acme.dbo.domain.Account;
import com.acme.dbo.domain.Client;
import com.acme.dbo.service.ClientService;

import java.math.BigDecimal;
import java.util.Collection;

public class ClientController {
    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    public void create(String amount) {
        service.create(new Account(new BigDecimal(amount)));
    }

    public Client findById(String clientId) {
        return service.findById(new Integer(clientId));
    }

    public Collection<Client> findAll() {
        return service.findAll();
    }
}

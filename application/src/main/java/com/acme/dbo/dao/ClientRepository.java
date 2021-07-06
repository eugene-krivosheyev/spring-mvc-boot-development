package com.acme.dbo.dao;

import com.acme.dbo.domain.Client;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClientRepository implements Repository<Client> {
    private final Map<Integer, Client> clients;

    public ClientRepository(int initialCapacity) {
        this.clients = new HashMap<>(initialCapacity);
    }

    @Override
    public Client create(Client data) {
        Client newClient = new Client(
                clients.isEmpty() ? 0 : Collections.max(clients.keySet()) + 1,
                data.getAccount());
        clients.put(newClient.getId(), newClient);
        return newClient;
    }

    @Override
    public Client findById(Integer id) {
        return clients.get(id);
    }

    @Override
    public Collection<Client> findAll() {
        return clients.values();
    }
}

package com.dbo.repository;

import com.dbo.domain.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientRepository {
    private Map<Integer, Client> clients;

    public ClientRepository() {
        clients = new HashMap<>();
    }

    public void saveClient(Client client) {
        clients.put(client.getId(), client);
    }

    public Client getClient(int id) {
        return clients.get(id);
    }
    
    public List<Client> getAll () {
        return new ArrayList<Client>(clients.values());
    }
}

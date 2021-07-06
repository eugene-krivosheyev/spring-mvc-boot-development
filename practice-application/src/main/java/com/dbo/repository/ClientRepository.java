package main.java.com.dbo.repository;

import main.java.com.dbo.domain.Client;

import java.util.HashMap;
import java.util.Map;

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
}

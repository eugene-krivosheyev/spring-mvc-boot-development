package com.acme.dbo;

import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class ClientRepository {
    private  Map<Integer, BankClient> clients;

    public ClientRepository() {
        clients = new HashMap<>();
    }
        
    public BankClient create(BankClient clientData){
            BankClient newClient = new BankClient(
                    clients.isEmpty() ? 0 : Collections.max(clients.keySet()) + 1,
                    clientData.getName()
            );

        clients.put(newClient.getId(), newClient);
        return newClient;
    }

    public BankClient findById(Integer id) {
        return clients.get(id);
    }

    public Collection<BankClient> findAll() {
        return clients.values();
    }
}

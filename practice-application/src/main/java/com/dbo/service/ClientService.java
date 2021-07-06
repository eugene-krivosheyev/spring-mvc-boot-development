package com.dbo.service;

import com.dbo.domain.Client;
import com.dbo.repository.ClientRepository;

import java.util.List;
import java.util.Map;

public class ClientService {
    ClientRepository clientRepository;
    
    public ClientService(ClientRepository repo) {
        this.clientRepository = repo;
    } 

    public void addNewClient(int id, String name) {
        Client client = new Client(id, name);
        clientRepository.saveClient(client);
    }

    public List<Integer> getClientAccountsById(int id) {
        return clientRepository.getClient(id).getAccounts();
    }

    public Client getClientById(int id) {
        return clientRepository.getClient(id);
    }
//    TODO:
    public List<Client> getAllClients() {
        return clientRepository.getAll();
    }
}

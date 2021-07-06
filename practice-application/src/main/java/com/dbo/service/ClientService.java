package main.java.com.dbo.service;

import main.java.com.dbo.domain.Client;
import main.java.com.dbo.repository.ClientRepository;

import java.util.List;
import java.util.Map;

public class ClientService {
    ClientRepository clientRepository;

    public void addNewClient(int id, String name) {
        Client client = new Client(id, name);
        clientRepository.saveClient(client);
    }

    public List<Integer> getClientAccountsById(int id) {
        return clientRepository.getClient(id).getAccounts();
    }

//    TODO:
    public List<Client> getAllClients() {
        return null;
    }
}

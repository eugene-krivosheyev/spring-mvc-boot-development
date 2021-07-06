package main.java.com.dbo.service;

import main.java.com.dbo.domain.Client;
import main.java.com.dbo.repository.ClientRepository;

public class ClientService {
    ClientRepository clientRepository;

    public void createClient(int id, String name) {
        Client client = new Client(id, name);
        clientRepository.saveClient(client);
    }
}

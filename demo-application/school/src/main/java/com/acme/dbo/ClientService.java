package com.acme.dbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClientService {
    private ClientRepository clients;
@Autowired
    public ClientService(ClientRepository clients){
        this.clients = clients;
    }
    public Collection<BankClient> findAll(){

        return clients.findAll();
    }
}

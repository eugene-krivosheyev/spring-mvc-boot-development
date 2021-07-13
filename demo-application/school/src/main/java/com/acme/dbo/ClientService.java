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
    public BankClient create(BankClient clientData) {
    return clients.create(clientData);
    }
    public BankClient findById(Integer id){
    return clients.findById(id);
    }
    public Collection<BankClient> findAll(){

        return clients.findAll();
    }
}

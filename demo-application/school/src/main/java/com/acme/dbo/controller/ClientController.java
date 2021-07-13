package com.acme.dbo.controller;
import com.acme.dbo.BankClient;
import com.acme.dbo.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/api/client")
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service){
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody BankClient clientData){
        service.create(clientData);
    }
    @GetMapping("/{id}")
    public BankClient findById(@PathVariable String id) throws ClientNotFoundException {
        BankClient client = service.findById(Integer.valueOf(id));
        if (client == null) throw new ClientNotFoundException(id);
        return client;
    }
    @GetMapping
    public Collection<BankClient> findAll(){
        return service.findAll();
    }
}

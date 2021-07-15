package com.acme.dbo.controller;
import com.acme.dbo.BankClient;
import com.acme.dbo.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.PositiveOrZero;
import java.util.Collection;


@RestController
@RequestMapping("/api/client")
@Validated
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service){
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BankClient create(@RequestBody @Valid BankClient clientData){
        return service.create(clientData);
    }
    @GetMapping("/{id}")
    public BankClient findById(@PathVariable @PositiveOrZero String id) throws ClientNotFoundException {
        BankClient client = service.findById(Integer.valueOf(id));
        if (client == null) throw new ClientNotFoundException(Integer.valueOf(id));
        return client;
    }
    @GetMapping
    public Collection<BankClient> findAll(){
        return service.findAll();
    }
}

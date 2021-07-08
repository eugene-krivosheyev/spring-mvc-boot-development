package com.acme.dbo;
import org.springframework.stereotype.Controller;

import java.util.Collection;


@Controller
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service){
        this.service = service;
    }

    public Collection<BankClient> findAll(){
        return service.findAll();
    }
}

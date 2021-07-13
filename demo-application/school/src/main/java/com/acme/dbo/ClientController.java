package com.acme.dbo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/api/client")
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service){
        this.service = service;
    }

    @GetMapping
    public  @ResponseBody Collection<BankClient> findAll(){
        return service.findAll();
    }
}

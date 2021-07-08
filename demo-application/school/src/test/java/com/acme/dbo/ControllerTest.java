package com.acme.dbo;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ControllerTest {
    @Test
    public void shouldGetClientsWhenRepoIsNotEmpty(){
       // ClientController sut = new ClientController(new ClientService(new ClientRepository()));
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ClientController sut = context.getBean(ClientController.class);

        Collection<BankClient> clients = sut.findAll();
        assertTrue(clients.contains(new BankClient("Vasya")));
        assertTrue(clients.contains(new BankClient("Petya")));


    }
}

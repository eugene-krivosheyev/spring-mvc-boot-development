package com.acme.dbo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collection;
@Repository
public class ClientRepository {
    public Collection<BankClient> findAll(){
        return Arrays.asList(
                new BankClient("Vasya"),
                new BankClient("Petya")
        );
    }
}

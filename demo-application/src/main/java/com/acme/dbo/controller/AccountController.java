package com.acme.dbo.controller;

import com.acme.dbo.domain.Account;
import com.acme.dbo.service.AccountService;

import java.math.BigDecimal;
import java.util.Collection;

public class AccountController {
    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    public void create(String amountData) {
        service.create(new BigDecimal(amountData));
    }

    public Account findById(String idData) {
        return service.findById(new Integer(idData));
    }

    public Collection<Account> findAll() {
        return service.findAll();
    }
}

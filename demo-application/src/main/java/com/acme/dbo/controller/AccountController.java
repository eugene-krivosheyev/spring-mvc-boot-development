package com.acme.dbo.controller;

import com.acme.dbo.domain.Account;
import com.acme.dbo.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collection;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody String amountData) {
        service.create(new BigDecimal(amountData));
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable String id) throws AccountNotFoundException {
        Account account = service.findById(new Integer(id));
        if (account == null) throw new AccountNotFoundException(id);
        return account;
    }

    @GetMapping
    public Collection<Account> findAll() {
        return service.findAll();
    }
}

package com.acme.dbo.controller;

import com.acme.dbo.domain.Account;
import com.acme.dbo.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.Collection;

@RestController
@RequestMapping("/api/account")
@Validated
public class AccountController {
    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Account accountData) {
        service.create(accountData);
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable @Positive Integer id) throws AccountNotFoundException {
        Account account = service.findById(id);
        if (account == null) throw new AccountNotFoundException(id);
        return account;
    }

    @GetMapping
    public Collection<Account> findAll() {
        return service.findAll();
    }
}

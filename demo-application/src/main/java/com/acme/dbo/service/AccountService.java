package com.acme.dbo.service;

import com.acme.dbo.dao.AccountRepository;
import com.acme.dbo.domain.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;

@Service //@Component
public class AccountService {
    private final AccountRepository accounts;

    public AccountService(AccountRepository accounts) {
        this.accounts = accounts;
    }

    public Account create(BigDecimal amount) {
        return accounts.create(new Account(amount));
    }

    public Account findById(Integer id) {
        return accounts.findById(id);
    }

    public Collection<Account> findAll() {
        return accounts.findAll();
    }
}

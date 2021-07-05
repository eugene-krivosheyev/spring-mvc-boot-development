package com.acme.dbo.dao;

import com.acme.dbo.domain.Account;

import java.util.Collection;

public interface AccountRepository {
    Account create(Account accountData);
    Account findById(Integer id);
    Collection<Account> findAll();
}

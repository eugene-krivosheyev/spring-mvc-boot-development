package com.acme.dbo;

import java.util.Collection;

public interface AccountRepository {
    Account create(Account accountData);
    Account findById(Integer id);
    Collection<Account> findAll();
}

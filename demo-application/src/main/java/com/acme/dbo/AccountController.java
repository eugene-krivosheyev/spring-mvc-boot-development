package com.acme.dbo;

import java.math.BigDecimal;
import java.util.Collection;

public class AccountController {
    private final AccountService service = new AccountService();

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

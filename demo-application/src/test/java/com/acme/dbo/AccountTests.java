package com.acme.dbo;

import com.acme.dbo.controller.AccountController;
import com.acme.dbo.domain.Account;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTests {
    private AccountController sut;

    @Before
    public void setUp() {
        sut = new AccountController();
    }

    @Test
    public void shouldGetNoAccountsWhenEmpty() {
        assertTrue(sut.findAll().isEmpty());
    }

    @Test
    public void shouldSaveAccountAmountWhenCreate() {
        sut.create("1.1");
        Collection<Account> savedAccounts = sut.findAll();

        assertEquals(1, savedAccounts.size());
        assertEquals(1.1, savedAccounts.stream().findAny().get().getAmount().doubleValue(), 0.001);
    }
}

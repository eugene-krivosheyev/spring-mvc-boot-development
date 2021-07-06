package java.com.acme.dbo;

import com.acme.dbo.controller.AccountController;
import com.acme.dbo.domain.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    private AccountController sut;
    private ClassPathXmlApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("application-config.xml");
        sut = context.getBean(AccountController.class);
    }

    @After
    public void tearDown() {
        context.close();
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

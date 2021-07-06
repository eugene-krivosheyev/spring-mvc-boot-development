import com.acme.dbo.controller.ClientController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class ClientTest {
//    private ClientController sut;
//    private ClassPathXmlApplicationContext context;
//
//    @Before
//    public void setUp() {
//        context = new ClassPathXmlApplicationContext("application-config.xml");
//        sut = context.getBean(.class);
//    }
//
//    @After
//    public void tearDown() {
//        context.close();
//    }
//
//    @Test
//    public void shouldGetNoAccountsWhenEmpty() {
//        assertTrue(sut.findAll().isEmpty());
//    }
//
//    @Test
//    public void shouldSaveAccountAmountWhenCreate() {
//        sut.create("1.1");
//        Collection<Account> savedAccounts = sut.findAll();
//
//        assertEquals(1, savedAccounts.size());
//        assertEquals(1.1, savedAccounts.stream().findAny().get().getAmount().doubleValue(), 0.001);
//    }
//}
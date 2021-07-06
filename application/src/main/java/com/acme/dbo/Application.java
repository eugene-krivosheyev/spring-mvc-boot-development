package com.acme.dbo;

import com.acme.dbo.controller.AccountController;
import com.acme.dbo.controller.ClientController;
import com.acme.dbo.domain.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;


public class Application {
    private static final Map<Integer, Account> accounts = new HashMap<>();

    public static void main(String... args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml")) {
//            AccountController controller = context.getBean(AccountController.class);
            ClientController clientController = context.getBean(ClientController.class);

            System.out.println("Account operations: create, get, get-by-id");
            Scanner console = new Scanner(System.in);

            while (true) {
                switch (console.next()) {
                    case "create":
//                        controller.create(console.next());
                        clientController.create(console.next());
                        break;

                    case "get-by-id":
//                        System.out.println(controller.findById(console.next()));
                        System.out.println(clientController.findById(console.next()));
                        break;

                    case "get":
//                        controller.findAll().forEach(System.out::println);
                        clientController.findAll().forEach(System.out::println);
                        break;

                    default:
                        System.exit(0);
                }
            }
        }
    }
}


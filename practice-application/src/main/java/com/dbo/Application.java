package com.dbo;

import com.dbo.config.Config;
import com.dbo.service.ClientService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ClientService clientService = context.getBean(ClientService.class);

        System.out.println("Account operations: create, get, get-by-id");
        Scanner console = new Scanner(System.in);
        int currentId = 0;

        while (true) {
            switch (console.next()) {
                case "create":
                    clientService.addNewClient(currentId, console.next());
                    currentId += 1;
                    break;

                case "get-by-id":
                    System.out.println(clientService.getClientAccountsById(Integer.valueOf(console.next())));
                    break;

                case "get":
                    clientService.getAllClients().forEach(System.out::println);
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}

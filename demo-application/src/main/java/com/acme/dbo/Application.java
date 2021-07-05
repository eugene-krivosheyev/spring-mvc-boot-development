package com.acme.dbo;

import com.acme.dbo.config.Config;
import com.acme.dbo.controller.AccountController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;


public class Application {
    public static void main(String... args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            AccountController controller = context.getBean(AccountController.class);

            System.out.println("Account operations: create, get, get-by-id");
            Scanner console = new Scanner(System.in);

            while (true) {
                switch (console.next()) {
                    case "create":
                        controller.create(console.next());
                        break;

                    case "get-by-id":
                        System.out.println(controller.findById(console.next()));
                        break;

                    case "get":
                        controller.findAll().forEach(System.out::println);
                        break;

                    default:
                        System.exit(0);
                }
            }
        }
    }
}

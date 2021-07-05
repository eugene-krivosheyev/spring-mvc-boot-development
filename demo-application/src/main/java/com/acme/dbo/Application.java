package com.acme.dbo;

import com.acme.dbo.controller.AccountController;
import com.acme.dbo.domain.Account;

import java.util.*;


public class Application {
    private static final Map<Integer, Account> accounts = new HashMap<>();

    public static void main(String... args) {
        AccountController controller = new AccountController();

        System.out.println("Account operations: create, get, get-by-id");
        Scanner console = new Scanner(System.in);

        while (true) {
            switch (console.next()) {
                case "create" :
                    controller.create(console.next());
                    break;

                case "get-by-id" :
                    System.out.println(controller.findById(console.next()));
                    break;

                case "get" :
                    controller.findAll().forEach(System.out::println);
                    break;

                default: System.exit(0);
            }
        }
    }
}

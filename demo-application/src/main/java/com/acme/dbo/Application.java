package com.acme.dbo;

import java.math.BigDecimal;
import java.util.*;


public class Application {
    private static final Map<Integer, Account> accounts = new HashMap<>();

    public static void main(String... args) {
        System.out.println("Account operations: create, get, get-by-id");
        Scanner console = new Scanner(System.in);

        while (true) {
            switch (console.next()) {
                case "create" : create(console.next()); break;
                case "get-by-id" : findById(console.next()); break;
                case "get" : findAll(); break;
                default: System.exit(0);
            }
        }
    }

    private static void create(String amountData) {
        System.out.println("creating " + amountData);

        Account newAccount = new Account(
                accounts.isEmpty() ? 0 : Collections.max(accounts.keySet()) + 1,
                new BigDecimal(amountData));
        accounts.put(newAccount.getId(), newAccount);

        System.out.println("created account: " + newAccount);
    }

    private static void findById(String idData) {
        System.out.println(accounts.get(new Integer(idData)));
    }

    private static void findAll() {
        accounts.values().forEach(System.out::println);
    }
}

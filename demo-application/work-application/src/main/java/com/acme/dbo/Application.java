package com.acme.dbo;

import java.util.*;


public class Application {
    private static final Map<Integer, MyClient> clients = new HashMap<>();

    public static void main(String... args)

    {
        ClientController controller = new ClientController();
        System.out.println("Client operations: create, get, get-by-id");
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

    private static void create(String amountData) {
        System.out.println("creating " + amountData);

        MyClient newMyClient = new MyClient(
                clients.isEmpty() ? 0 : Collections.max(clients.keySet()) + 1);
        clients.put(newMyClient.getId(), newMyClient);

        System.out.println("created account: " + newMyClient);
    }

    private static void findById(String idData) {
        System.out.println(clients.get(Integer.valueOf(idData)));
    }

    private static void findAll() {
        clients.values().forEach(System.out::println);
    }
}

package com.acme.dbo;

import java.math.BigDecimal;
import java.util.Collection;

public class ClientController {
    private final ClientService service = new ClientService();

    public void create(String amountData) {
        service.create(new BigDecimal(amountData));
    }

    public MyClient findById(String idData) {
        return service.findById(Integer.valueOf(idData));
    }

    public Collection<MyClient> findAll() {
        return service.findAll();
    }
}

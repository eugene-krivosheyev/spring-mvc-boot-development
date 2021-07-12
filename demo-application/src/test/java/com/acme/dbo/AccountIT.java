package com.acme.dbo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AccountIT {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldGetEmptyArrayWhenNoAccounts() throws Exception {
        mockMvc.perform(get("/api/account/"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    public void shouldGetNotFoundStatusWhenNoGivenAccounts() throws Exception {
        mockMvc.perform(get("/api/account/1"))
                .andExpect(status().isNotFound());
    }
}

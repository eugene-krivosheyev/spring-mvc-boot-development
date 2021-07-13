package com.acme.dbo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringJUnitWebConfig(classes = com.acme.dbo.config.Config.class)
public class ClientIT {
    private MockMvc mockMvc;

    @BeforeEach
    void setUp(WebApplicationContext wac) {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void shouldGetEmptyArrayWhenNoClients() throws Exception {
        mockMvc.perform(get("/api/client/"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    public void shouldGetNotFoundStatusWhenNoGivenClients() throws Exception {
        mockMvc.perform(get("/api/client/0"))
                .andExpect(status().isNotFound());
    }
}

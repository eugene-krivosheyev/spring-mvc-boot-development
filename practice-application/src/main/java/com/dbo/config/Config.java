package com.dbo.config;

import com.dbo.repository.ClientRepository;
import com.dbo.service.ClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ClientRepository clientRepository () {
        return new ClientRepository();
    }
    
    @Bean
    public ClientService clientService(ClientRepository repository) {
        return new ClientService(repository);
    }
}

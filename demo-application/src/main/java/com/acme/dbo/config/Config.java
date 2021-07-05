package com.acme.dbo.config;

import com.acme.dbo.dao.AccountRepository;
import com.acme.dbo.dao.MapBackedAccountRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:application-config.xml")
public class Config {
    @Bean
    public AccountRepository accounts(@Value("${accounts.repo.init-capacity}") int initialCapacity) {
        return new MapBackedAccountRepository(initialCapacity);
    }
}

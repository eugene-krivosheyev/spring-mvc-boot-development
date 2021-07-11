package com.acme.dbo.config;

import com.acme.dbo.dao.AccountRepository;
import com.acme.dbo.dao.MapBackedAccountRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class Config {
    @Bean
    public AccountRepository accounts(@Value("${accounts.repo.init-capacity}") int initialCapacity) {
        return new MapBackedAccountRepository(initialCapacity);
    }
}

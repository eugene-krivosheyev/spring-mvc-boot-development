package com.acme.dbo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan ("com.acme.dbo")
@EnableWebMvc
public class Config {
}
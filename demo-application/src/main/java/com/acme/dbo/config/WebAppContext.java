package com.acme.dbo.config;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebAppContext extends AnnotationConfigWebApplicationContext {
    public WebAppContext() {
        register(Config.class);
    }
}

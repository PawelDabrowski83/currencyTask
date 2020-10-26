package com.facebook.currency_service.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyServiceConfig {

    @Bean
    protected CurrencyService simpleCurrencyService() {
        return new CurrencyServiceImpl();
    }
}

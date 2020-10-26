package com.facebook.currency_service;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CurrencyServiceImpl implements CurrencyService{

    public CurrencyEnum getCurrencyByCode(String name){
        Optional<CurrencyEnum> currencyOptional = Stream.of(CurrencyEnum.values()).filter(n -> name.equals(n.name())).findFirst();
        return currencyOptional.orElse(CurrencyEnum.NULL);
    }
}

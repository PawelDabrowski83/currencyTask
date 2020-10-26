package com.facebook.currency_service.service;

import com.facebook.currency_service.model.CurrencyEnum;
import com.facebook.currency_service.service.CurrencyService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    public CurrencyEnum getCurrencyValueByCode(String currencyCode){
        Optional<CurrencyEnum> currencyOptional = Stream.of(CurrencyEnum.values()).filter(n -> currencyCode.equals(n.name())).findFirst();
        return currencyOptional.orElse(CurrencyEnum.NULL);
    }


}

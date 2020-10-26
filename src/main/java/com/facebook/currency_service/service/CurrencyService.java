package com.facebook.currency_service.service;

import com.facebook.currency_service.model.CurrencyEnum;

public interface CurrencyService {

    CurrencyEnum getCurrencyValueByCode(String currencyCode);
}

package com.facebook.currency_service;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CurrencyEnum {

        PLN("PLN", 3.55f),
        USD("UST", 5.55f),
        EUR("EUR", 4.55f),
        NULL("", 0f);

    private final String name;

    @JsonProperty("currencyValue")
    private final float currencyValue;

    private CurrencyEnum(String name, float currencyValue) {
        this.name = name;
        this.currencyValue = currencyValue;
    }

    public String getName() {
        return name;
    }

    public float getCurrencyValue() {
        return currencyValue;
    }
}

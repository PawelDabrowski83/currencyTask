package com.facebook.currency_service;

public enum CurrencyEnum {

        PLN("PLN", 3.55f),
        USD("UST", 5.55f),
        EUR("EUR", 4.55f),
        NULL("", 0f);

    private final String name;
    private final float value;

    private CurrencyEnum(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }
}

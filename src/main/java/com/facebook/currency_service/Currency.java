package com.facebook.currency_service;

public class Currency {
    protected static final Currency PLN = new Currency("PLN", 3.55f);
    protected static final Currency EUR = new Currency("EUR", 4.55f);
    protected static final Currency USD = new Currency("USD", 5.55f);
    protected static final Currency NULL = new Currency("", 0f);


    private final String name;
    private final float value;

    private Currency(String name, float value) {
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

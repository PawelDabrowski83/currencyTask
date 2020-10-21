package com.facebook.currency_service;

public class CurrencyService {

    public Currency getCurrency(String name){
        switch (name){
            case "PLN":
                return Currency.PLN;
            case "USD":
                return Currency.USD;
            case "EUR":
                return Currency.EUR;
            default:
                return Currency.NULL;
        }
    }
}

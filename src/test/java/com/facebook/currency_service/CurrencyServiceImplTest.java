package com.facebook.currency_service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CurrencyServiceImplTest {

    final CurrencyService currencyService = new CurrencyServiceImpl();

    private static Stream<Arguments> currencyValuesProvider(){
        return Stream.of(
                Arguments.of("PLN", 3.55f),
                Arguments.of("EUR", 4.55f),
                Arguments.of("USD", 5.55f)
        );
    }

//    @DisplayName("should service return currency values")
//    @ParameterizedTest
//    @MethodSource("currencyValuesProvider")
//    void

}
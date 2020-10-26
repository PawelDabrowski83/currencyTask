package com.facebook.currency_service;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/currency")
public class CurrencyController {

    final CurrencyServiceImpl currencyServiceImpl;
    private final Gson gson = new Gson();

    public CurrencyController(CurrencyServiceImpl currencyServiceImpl) {
        this.currencyServiceImpl = currencyServiceImpl;
    }

    @GetMapping("/{currencyCode}")
    @ResponseBody
    public float getCurrency(@PathVariable String currencyCode, HttpServletResponse response) throws IOException {
        return currencyServiceImpl.getCurrencyByCode(currencyCode).getValue();
    }
}

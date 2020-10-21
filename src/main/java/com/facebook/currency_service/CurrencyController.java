package com.facebook.currency_service;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/currency")
public class CurrencyController extends HttpServlet {

    private final Gson gson = new Gson();

    @GetMapping("/{currencyName}")
    public void getCurrency(@PathVariable String currencyName, HttpServletResponse response) throws IOException {
        CurrencyService currencyService = new CurrencyService();
        Currency actualCurrency = currencyService.getCurrency(currencyName);

        String gsonString = "";
        if (Currency.NULL.equals(actualCurrency)){
            gsonString = this.gson.toJson("Currency unknown");
            response.setStatus(404);
        } else {
            gsonString = this.gson.toJson(actualCurrency);
            response.setStatus(200);
        }
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(gsonString);
        out.flush();
    }
}

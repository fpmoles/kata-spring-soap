package com.frankmoley.kata.soap.kataspringsoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    private final CurrencyClient client;

    @Autowired
    public ConversionController(CurrencyClient client){
        super();
        this.client = client;
    }

    @PostMapping(value="/actions/convert", produces= MediaType.APPLICATION_JSON_VALUE)
    public Conversion convertCurrency(@RequestBody ConversionRequest request){
        Conversion result = new Conversion();
        result.setCurrencyType(request.getToCurrencyType());
        double conversionRate = this.client.getCurrencyConversionRate(request.getFromCurrencyType(), request.getToCurrencyType());
        result.setAmount(request.getAmount()*conversionRate);
        return result;
    }
}

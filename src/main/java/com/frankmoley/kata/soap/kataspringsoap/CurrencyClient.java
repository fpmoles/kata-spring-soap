package com.frankmoley.kata.soap.kataspringsoap;

import net.webservicex.currency.ConversionRate;
import net.webservicex.currency.ConversionRateResponse;
import net.webservicex.currency.Currency;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CurrencyClient extends WebServiceGatewaySupport{

    public double getCurrencyConversionRate(Currency fromCurrency, Currency toCurrency){
        ConversionRate rate = new ConversionRate();
        rate.setFromCurrency(fromCurrency);
        rate.setToCurrency(toCurrency);

        ConversionRateResponse response = (ConversionRateResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.webservicex.net/CurrencyConvertor.asmx",
                        rate, new SoapActionCallback("http://www.webserviceX.NET/ConversionRate"));

        return response.getConversionRateResult();
    }

}

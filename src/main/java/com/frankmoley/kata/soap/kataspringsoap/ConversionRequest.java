package com.frankmoley.kata.soap.kataspringsoap;

import net.webservicex.currency.Currency;

public class ConversionRequest {
    private double amount;
    private Currency fromCurrencyType;
    private Currency toCurrencyType;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getFromCurrencyType() {
        return fromCurrencyType;
    }

    public void setFromCurrencyType(Currency fromCurrencyType) {
        this.fromCurrencyType = fromCurrencyType;
    }

    public Currency getToCurrencyType() {
        return toCurrencyType;
    }

    public void setToCurrencyType(Currency toCurrencyType) {
        this.toCurrencyType = toCurrencyType;
    }
}

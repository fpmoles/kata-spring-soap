package com.frankmoley.kata.soap.kataspringsoap;

import net.webservicex.currency.Currency;

public class Conversion {
    private double amount;
    private Currency currencyType;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Currency currencyType) {
        this.currencyType = currencyType;
    }
}

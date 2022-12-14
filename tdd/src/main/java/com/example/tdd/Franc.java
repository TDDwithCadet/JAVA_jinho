package com.example.tdd;

public class Franc extends Money
{
    Franc(int amount, String currency)
    {
        super(amount, currency);
    }
    public Money times(int multiplier)
    {
        return new Franc(amount * multiplier, "CHF");
    }

    String currency()
    {
        return currency;
    }
}

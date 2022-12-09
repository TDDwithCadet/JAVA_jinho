package com.example.tdd;

public class Dollar extends Money
{
    public Dollar(int amount, String currency)
    {
        super(amount, currency);
    }
    public Money times(int multiplier)
    {
        return new Dollar(amount * multiplier, "USD");
    }

    Money times(int amount)
    {
        return null;
    }

    String currency()
    {
        return currency;
    }
}

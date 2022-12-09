package com.example.tdd;

public class Dollar extends Money
{
    public Dollar(int amount)
    {
        this.amount = amount;
    }
    public Dollar times(int multiplier)
    {
        return new Dollar(amount * multiplier);
    }

}

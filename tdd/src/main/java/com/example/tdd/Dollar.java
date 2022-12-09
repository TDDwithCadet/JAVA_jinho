package com.example.tdd;

public class Dollar {
    public int amount = 5;

    public Dollar(int amount)
    {
        this.amount = amount;
    }
    public Dollar times(int multiplier)
    {
        return new Dollar(amount * multiplier);
    }
}

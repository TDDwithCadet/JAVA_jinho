package com.example.tdd;

public class Dollar {
    public int amount = 5;

    public Dollar(int amount)
    {
        this.amount = amount;
    }
    public void times(int multiplier)
    {
        this.amount = amount * multiplier;
    }
}

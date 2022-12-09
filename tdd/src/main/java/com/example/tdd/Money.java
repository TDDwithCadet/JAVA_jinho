package com.example.tdd;

abstract public class Money
{
    protected int amount;
    protected String currency;
    Money(int amount, String currency)
    {
        this.amount = amount;
        this.currency = currency;
    }
    public static Money dollar(int amount)
    {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount)
    {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object)
    {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
    abstract public Money times(int multiplier);

    abstract String currency();
}

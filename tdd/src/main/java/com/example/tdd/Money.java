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
        return new Money(amount, "USD");
    }

    public static Money franc(int amount)
    {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object)
    {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }
    abstract public Money times(int multiplier);

    abstract String currency();

    public Money plus(Money addend)
    {
        return new Sum(this, addend);
    }

    public Money reduce(String to)
    {
        return this;
    }

    Expression plus(Money addend)
    {
        return new Money(amount + added.amount, currency);
    }

}

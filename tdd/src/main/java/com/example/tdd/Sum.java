class Sum implements Expression {
    Money augend;
    Money addend;

    Sum(Money augend, Money added) {
        this.augend = augend;
        this.addend = addend
    }

    public Money reduce(String to)
    {
        int amount = augend.amount + added.amount;
        return new Money(amount, to);
    }
}

class Sum implements Expression {
//    Money augend;
//    Money addend;
    Expression augend;
    Expression addend;

    Sum(Expression augend, Expression added) {
        this.augend = augend;
        this.addend = addend
    }

    public Money reduce(String to)
    {
        int amount = augend.amount + added.amount;
        return new Money(amount, to);
    }

    public Money reduce(Bank bank, String to)
    {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}

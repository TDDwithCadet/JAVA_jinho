import com.example.tdd.Money;

import java.beans.Expression;

class Sum implements Expression {
//    Money augend;
//    Money addend;
    Expression augend;
    Expression addend;

    Sum(Expression augend, Expression added) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to)
    {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend)
    {
        return new Sum(this, addend);
    }

    Expression times(int multiplier)
    {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }
}

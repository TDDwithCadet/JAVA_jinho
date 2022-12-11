package com.example.tdd;

public class Bank {

    private Hashtable rates = new Hashtable();
    Money reduce(Expression source, String to)
    {
//        if (source instanceof Money)
//            return (Money) source.reduce(to);
//        Sum sum = (Sum) source;
//        int amount = sum.augend.amount + sum.addend.amount;
//        return Money.dollar((10);
//        return sum.reduce(to);
        return source.reduce(this, to);
    }

    int rate(String from, String to)
    {
        if (from.equals(to))
            return 1;
        Integer rate = (Integer)rates.get(new Pair(from, to));
        return rate.intValue();
    }
}

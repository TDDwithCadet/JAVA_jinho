package com.example.tdd;

public interface Expression {
    Money reduce(String to);

    Expression times(int multipiler);
}

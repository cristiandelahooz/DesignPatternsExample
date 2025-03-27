package com.example.builder;

public class Director {
    public Product construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}

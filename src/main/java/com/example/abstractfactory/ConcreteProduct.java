package com.example.abstractfactory;

public class ConcreteProduct implements Product {
    @Override
    public void use() {
        System.out.println("Using Concrete Product");
    }
}

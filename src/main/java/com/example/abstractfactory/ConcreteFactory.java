package com.example.abstractfactory;

public class ConcreteFactory extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}

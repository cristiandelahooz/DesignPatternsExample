package com.example.abstractfactory;

public class ConcreteMonacoFactory extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcretMonaco();
    }
}

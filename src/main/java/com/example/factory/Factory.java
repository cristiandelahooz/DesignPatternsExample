package com.example.factory;

public class Factory {
    public Product createProduct() {
        return new ConcreteProduct();
    }
}

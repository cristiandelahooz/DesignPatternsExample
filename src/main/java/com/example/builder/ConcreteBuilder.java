package com.example.builder;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public void buildPartA() { product.setPartA("Parte A construida"); }
    public void buildPartB() { product.setPartB("Parte B construida"); }

    public Product getResult() {
        return product;
    }
}

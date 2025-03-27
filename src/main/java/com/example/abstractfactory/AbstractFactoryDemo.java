package com.example.abstractfactory;

public class AbstractFactoryDemo {
  public static void main(String[] args) {
    AbstractFactory factory = new ConcreteMonacoFactory();
    Product product = factory.createProduct();
    product.deliver();
  }
}

package com.example.abstractfactory;

public class ConcreteProduct implements Product {
  @Override
  public void deliver() {
    System.out.println("Product delivered!");
  }
}

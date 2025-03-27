package com.example.abstractfactory;

public class ConcretMonaco implements Product {
  @Override
  public void deliver() {
    System.out.println("Monaco delivered!");
  }
}

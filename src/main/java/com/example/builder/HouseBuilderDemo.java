package com.example.builder;

public class HouseBuilderDemo {
  public static void main(String[] args) {
    House house = new House.HouseBuilder().doors(4).windows(6).build();
    System.out.println("House built with " + house);
  }
}

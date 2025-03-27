package com.example.builder;

public class HouseBuilderDemo {
    public static void main(String[] args) {
        House house = new House.HouseBuilder().setDoors(4).setWindows(6).build();
        System.out.println("House built with " + house);
    }
}

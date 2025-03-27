package com.example.main;

import com.example.factory.Factory;
import com.example.singleton.Singleton;
import com.example.abstractfactory.*;
import com.example.prototype.ConcretePrototype;
import com.example.builder.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demostrando patrones de diseño en Java\n");

        // Singleton
        Singleton instance = Singleton.getInstance();
        instance.showMessage();

        // Factory
        Factory factory = new Factory();
        System.out.println(factory.createProduct().getDescription());

        // Abstract Factory
        AbstractFactory abstractFactory = new ConcreteFactory1();
        System.out.println("Abstract Factory: " + abstractFactory.createProductA().getType());

        // Prototype
        ConcretePrototype prototype1 = new ConcretePrototype("Original");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();
        System.out.println("Prototype Clonado: " + prototype2.getName());

        // Builder
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        Product product = director.construct(builder);
        System.out.println("Builder: " + product.getDescription());
    }
}

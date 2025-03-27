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

	//Prototype
	PrototypeRegistry registry = new PrototypeRegistry();
        Button button = new Button(10, 40, "red");
        registry.addItem("LandingButton", button);
        Button clonedButton = (Button) registry.getByColor("red");

        // Builder
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        Product product = director.construct(builder);
        System.out.println("Builder: " + product.getDescription());
    }
}

package com.example.prototype;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype("Hello Prototype");
        Prototype cloned = (Prototype) prototype.clone();
        System.out.println(((ConcretePrototype) cloned).getMessage());
    }
}

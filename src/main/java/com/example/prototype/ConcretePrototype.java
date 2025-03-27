package com.example.prototype;

public class ConcretePrototype extends Prototype {
    private String message;
    
    public ConcretePrototype(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}

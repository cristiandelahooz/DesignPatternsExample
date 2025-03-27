package com.example.builder;

public class Product {
    private String partA;
    private String partB;

    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }

    public String getDescription() {
        return "Product with " + partA + " and " + partB;
    }
}

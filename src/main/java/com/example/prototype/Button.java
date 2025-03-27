package com.example.prototype;

public class Button implements Prototype {
  private int x, y;
  private String color;

  public Button(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  public Button(Button prototype) { // Constructor de clonación
    this.x = prototype.x;
    this.y = prototype.y;
    this.color = prototype.color;
  }

  @Override
  public String getColor() {
    return color;
  }

  @Override
  public Prototype clone() {
    return new Button(this);
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

}

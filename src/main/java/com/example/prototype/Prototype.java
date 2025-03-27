package com.example.prototype;

public interface Prototype {
  String getColor();

  void setColor(String color);

  Prototype clone();
}

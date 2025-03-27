package com.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeRegistry {
  private List<Prototype> items = new ArrayList<>();

  public PrototypeRegistry() {
  }

  public void addItem(String id, Prototype p) {
    items.add(p);
  }

  public Prototype getByColor(String color) {
    for (Prototype item : items) {
      if (item.getColor().equals(color)) {
        return item.clone();
      }
    }
    return null;
  }
}

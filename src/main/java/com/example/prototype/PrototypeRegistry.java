package com.example.prototype;

class PrototypeRegistry {
    private List<Prototype> items = new ArrayList<>();

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


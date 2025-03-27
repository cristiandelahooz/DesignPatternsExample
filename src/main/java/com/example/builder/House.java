package com.example.builder;

public class House {
    private int doors;
    private int windows;
    
    private House(HouseBuilder builder) {
        this.doors = builder.doors;
        this.windows = builder.windows;
    }
    
    public static class HouseBuilder {
        private int doors;
        private int windows;
        
        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }
        
        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }
        
        public House build() {
            return new House(this);
        }
    }
}

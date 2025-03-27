package com.example.main;

import com.example.logistics.Logistics;
import com.example.logistics.RoadLogistics;
import com.example.logistics.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery(); // Salida: Deliver by land in a box.

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery(); // Salida: Deliver by sea in a container.
    }
}

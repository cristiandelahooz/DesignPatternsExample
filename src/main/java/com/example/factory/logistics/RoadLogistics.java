package com.example.logistics;

import com.example.transport.Truck;
import com.example.transport.Transport;

public class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}

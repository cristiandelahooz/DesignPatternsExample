package com.example.factory.logistics;

import com.example.factory.transport.Transport;
import com.example.factory.transport.Truck;
import com.example.factory.transport.Ship;

public class LogisticsDemo {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}

abstract class Logistics {
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    protected abstract Transport createTransport();
}

class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}

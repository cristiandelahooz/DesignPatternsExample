package com.example.logistics;

import com.example.transport.Ship;
import com.example.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}

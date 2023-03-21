package com.sarvesh.interfaces.multipleInheritance;

public class SmartTV implements gadget {

    @Override
    public void channel() {
        System.out.println("External Channels are supported in SmartTV");
    }

    @Override
    public void on() {
        System.out.println("Smart Tv is On");
    }

    @Override
    public void gadgetcost() {
        System.out.println("Cost of SmartTV is 50,000 Rs");
    }
}

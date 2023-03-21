package com.sarvesh.interfaces.multipleInheritance;

public class TV implements gadget{
    @Override
    public void channel() {
        System.out.println("Playing Channel 124 on TV");
    }

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void gadgetcost() {
        System.out.println("Cost of TV is 25,000 Rs");
    }
}

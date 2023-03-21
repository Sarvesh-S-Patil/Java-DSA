package com.sarvesh.interfaces;

public class PowerEngine implements Engine{


    @Override
    public void acc() {
        System.out.println("Acclerate Power Engine");
    }

    @Override
    public void start() {
        System.out.println("Start Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Power Engine");
    }
}

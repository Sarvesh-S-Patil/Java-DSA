package com.sarvesh.interfaces;

public class Car {
    private Engine engine;
    public void electricCar(){
        engine = new electricEngine();
    }
    public void powerCar(){
        engine = new PowerEngine();
    }
    public void acc() {
        engine.acc();
    }
    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

}

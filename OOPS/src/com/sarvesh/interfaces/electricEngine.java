package com.sarvesh.interfaces;

public class electricEngine implements Engine{
    @Override
    public void acc(){
        System.out.println("Acclerate the electric car");
    };
    @Override
    public void start(){
        System.out.println("Starting the electric car");
    };
    @Override
    public void stop(){
        System.out.println("Stop the electric car");
    };

}

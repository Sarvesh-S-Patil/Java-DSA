package com.sarvesh.properties.inheritance.Singleton;

public class Singletonex {
    private Singletonex(){

    }
    private static Singletonex instance;
    public static Singletonex getinstance(){
            if(instance == null){
                instance = new Singletonex();
            }
            return instance;
    }
}

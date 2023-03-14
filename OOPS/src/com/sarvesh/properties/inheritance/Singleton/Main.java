package com.sarvesh.properties.inheritance.Singleton;

public class Main {
    public static void main(String[] args) {
        Singletonex obj1 =  Singletonex.getinstance();
        Singletonex obj2 = Singletonex.getinstance();
        Singletonex obj3 = Singletonex.getinstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

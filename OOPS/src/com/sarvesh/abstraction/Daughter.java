package com.sarvesh.abstraction;

public class Daughter extends Parent{
    @Override
    void career(String name){
        System.out.println("I am going to be an engineer");
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love "+name+",his age is "+age);
    }

}

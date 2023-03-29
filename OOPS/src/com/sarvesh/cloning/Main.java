package com.sarvesh.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human sarvesh = new human("Sarvesh",20);
        human twin = (human) sarvesh.clone() ;
        int a = (int)20.00;
        System.out.println(twin.age+" "+twin.name);
    }

}

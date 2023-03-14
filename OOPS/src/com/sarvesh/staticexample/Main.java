package com.sarvesh.staticexample;

public class Main {
    public static void main(String[] args) {
        Human Sarvesh = new Human(20,"Sarvesh Patil",100000,false);
        Human Rahul = new Human(34,"rahul dravid",50000,true);
        System.out.println(Rahul.name);
        System.out.println(Sarvesh.name);
        System.out.println(Human.population);
         Main obj = new Main();
         obj.fun2();
    }

    public void fun2(){
        System.out.println("Hello");
    }
}

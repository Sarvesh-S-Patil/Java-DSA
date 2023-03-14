package com.sarvesh.staticexample;

public class Human {
    int age;
    String name;
    float Salary;
    boolean isMarried;
    static int population;
    Human(int age,String name , float Salary,boolean isMarried){
        this.age = age;
        this.name=name;
        this.Salary=Salary;
        this.isMarried=isMarried;
        Human.population+=1;
    }
}

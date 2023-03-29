package com.sarvesh.cloning;

public class human  implements  Cloneable{
    String name;
    int age;

    public human(String name , int age) {
        this.name = name;
        this.age=age;
    }

    public human(human other){
        this.age= other.age;
        this.name=other.name;
    }

    public  Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
}

package com.sarvesh.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(5,5,7);
        BoxWeight heavyBox = new BoxWeight(8,5,4);
        box.information();
        System.out.println(heavyBox.l + " " +heavyBox.w + " "+ heavyBox.h);

        BoxPrice cheese = new BoxPrice(5,6,8,10,12);
        System.out.println("Box h "+cheese.h + " l : "+cheese.l+ " weight  :"+cheese.weight+ " cost: "+cheese.cost);
    }
}

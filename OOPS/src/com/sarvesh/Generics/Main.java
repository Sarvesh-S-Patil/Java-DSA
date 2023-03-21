package com.sarvesh.Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayLists Marks = new CustomArrayLists();
        for(int i =0;i<=13;i++){
            Marks.add(i);
        }
        System.out.println(Marks.toString());
        CustomGenArrayLists<String> Grocery = new CustomGenArrayLists<>();
        Grocery.add("Brinjal");
        System.out.println(Grocery.toString());

    }
}

package com.sarvesh.Generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        int temp = 2;
        for(int i =0; i <5;i++){
            arr.add(temp*2);
            temp *=2;
        }
        arr.forEach(x -> System.out.println(x));
        OP sum = (a,b) -> a+b;
        System.out.println(sum.OP(5,10));
        System.out.println(sum.getClass().getName());
    }
    interface OP{
        int OP(int a , int b);
    }

}

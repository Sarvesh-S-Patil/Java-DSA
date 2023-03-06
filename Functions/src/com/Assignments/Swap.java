package com.Assignments;

public class Swap {
    public static void main(String[] args) {
        int a =32;
        int b =56;
        int[] temp = {a,b};
        System.out.println(a+" "+b);

    }

    static void swap(int a , int b){
        int temp =a ;
        a=b;
        b=temp;
    }
}

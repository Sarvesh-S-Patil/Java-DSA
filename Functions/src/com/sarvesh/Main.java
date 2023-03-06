package com.sarvesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 6;
        swap(a,b);
        System.out.println(a+" " +b);
    }

    static void Greetings(String name ) {
        System.out.println("Hello "+name);

    }

    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;

    }
}
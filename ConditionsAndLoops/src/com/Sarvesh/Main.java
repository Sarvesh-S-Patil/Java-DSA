package com.Sarvesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to compare ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max =0;
        if(a<b){
            max = b;
        }
        else{
            max = a;
        }
        if(max<c){
            max=c;
        }
        System.out.println("Maximum number is : "+max);
    }
}
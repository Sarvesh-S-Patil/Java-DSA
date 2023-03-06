package com.Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        long res = fact(num);
        System.out.print("Factorial of "+num+" is "+res);
    }

     static long fact(int num ) {
        long factorial=1;
        while(num>0) {
            factorial  *= num;
            num--;
        }
        return  factorial;
    }
}

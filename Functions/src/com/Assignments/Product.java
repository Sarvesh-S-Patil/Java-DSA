package com.Assignments;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int result = product(num1,num2);
        System.out.print("The product of these two numbers is : "+result);

    }

    static int product(int a , int b){
        int c = a*b;
        return c;
    }
}

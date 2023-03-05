package com.Assignments;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = input.nextInt();
        System.out.print("Enter a number : ");
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("Larger number is : "+ num1);
        }
        else
            System.out.println("Larger number is : "+ num2);
    }
}

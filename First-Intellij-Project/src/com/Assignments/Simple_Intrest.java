package com.Assignments;


//  Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.


import java.util.Scanner;

public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int Principal = input.nextInt();
        System.out.print("Enter Time in years : ");
        int Time = input.nextInt();
        System.out.print("Enter Rate in % : ");
        double Rate = input.nextDouble();
        double SimpleIntrest = (Principal*Time*Rate)/100;
        System.out.println("Simple Intrest is "+SimpleIntrest);

    }
}

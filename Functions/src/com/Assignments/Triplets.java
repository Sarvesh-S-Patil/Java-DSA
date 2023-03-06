package com.Assignments;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers to check for Pythogorean triplets : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(isTriplet(num1,num2,num3)){
            System.out.println(num1+ " "+ num2+" " + num3+ " are Pythagorean triplets ");
        }
        else
        System.out.println(num1+ " "+ num2+" " + num3+ " are not Pythagorean triplets ");

    }

    static boolean isTriplet(int num1, int num2, int num3) {
        int sq1 = num1*num1;
        int sq2 = num2*num2;
        int sq3 = num3*num3;
        if((sq1+sq2) == sq3)
            return true;
        else
            return false;
    }


}

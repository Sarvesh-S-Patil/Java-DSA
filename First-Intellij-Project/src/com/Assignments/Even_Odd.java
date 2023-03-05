package com.Assignments;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0 ){
            System.out.println("You have entered an even no ");
        }
        else
            System.out.println("You have entered an odd no");
    }


}

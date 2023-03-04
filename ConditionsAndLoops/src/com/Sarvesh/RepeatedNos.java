package com.Sarvesh;

import java.util.Scanner;

public class RepeatedNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter a number to check for repeated numbers : ");
        int repeat = sc.nextInt();
        int check = num;
        int count = 0 ;
        while (check > 0)
        {
            int rem = (check%10);

            if(rem == repeat){
                count++;
            }
            check = check/10;


        }
        System.out.println(repeat+" is repeated "+count+ " times in the given number");
    }
}

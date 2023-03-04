package com.Sarvesh;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be reversed : ");
        int num= sc.nextInt();
        int test = num;
        int rev_num = 0;
        while (test >0)
        {
            int rem = test%10;
            rev_num = (rev_num*10)+rem;
            test = test/10;

        }
        System.out.println("Reversed Number is : "+rev_num);
    }
}

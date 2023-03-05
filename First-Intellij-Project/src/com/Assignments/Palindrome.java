package com.Assignments;
import java.lang.Math;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        char[] Sample;
        Sample = sc.next().toCharArray();
        int length = Sample.length;
        int mid = (int) (Math.ceil((length/2.0)));
        System.out.println(mid);
        boolean test = true;
        int i,j;
        i=0;
        j=length-1;
        while(i<j)
        {
            if(Sample[i]==Sample[j])
            {
                i++;
                j--;

            }
            else
            {
                test = false;
                break;
            }

        }

        if( test == true)
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given String is not Palindrome");

    }
}

package com.Assignments;

import java.util.Scanner;
import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which fibonacci Series is to be calculated : ");
        int FibNo = sc.nextInt();
        int[] Series ;
        Series = new int[FibNo];
            for(int i=0;i<FibNo;i++)
            {
                if(i>2){
                    Series[i]= (Series[i-2]+Series[i-1]);
                }
                else
                    Series[i]=i;

            }


        for(int i = 0 ; i < FibNo ; i++){
            System.out.print(Series[i]+ " ");
        }
    }
}

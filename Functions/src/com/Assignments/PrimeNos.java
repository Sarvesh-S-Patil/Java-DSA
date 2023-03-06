package com.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int large,small;
        if(num1<num2){
            small =num1;
            large = num2;
        }
        else if(num1>num2){
            small=num2;
            large=num1;
        }
        else
            small=large=num1;
        small +=1;
        int[] PrimeNos = new int[(large-small)];
        int i =0;
        while(small<large){
            if(isPrime(small)){
                PrimeNos[i]=small;
                i++;
            }
            small++;
        }
       System.out.println("The Prime Numbers between "+num1+" and "+num2+" are : "+ Arrays.toString(PrimeNos));


    }

    static boolean isPrime(int small) {
        int j =2;
        while (j*j<=small){
            if(small%j ==0){
                return false;
            }
            j++;

        }
        return true;
    }
}

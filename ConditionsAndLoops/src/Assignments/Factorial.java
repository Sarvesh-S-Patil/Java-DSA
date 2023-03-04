package Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        long  Factorial =1l;
        int i = num;
        while(i>0){
            Factorial *= i;
            i--;
        }
        System.out.println("Factorial of "+num+" is "+Factorial);
    }
}

package com.Assignments;

import java.util.Scanner;

public class DollarConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in rupees : ");
        int Rupees = sc.nextInt();
        double Dollars = 0.012665773*Rupees;
        System.out.println("The entered amount in dollars is : "+Dollars);
    }
}

package Assignments;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.print("Enter the amount of product : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.print("Enter the discount on product in % : ");
        int DiscPercent = sc.nextInt();
        int DiscValue = 0;
        DiscValue = (DiscPercent*amount)/100;
        System.out.print("The discount is equal to : "+DiscValue);

    }
}

package com.Sarvesh;

import java.util.Arrays;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  day :");
        String Day = sc.next();
        System.out.print("Enter Veg or Non-veg : ");
        String food = sc.next();
        switch (Day) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                switch (food) {
                    case "Veg" -> System.out.println("Paneer is available");
                    case "Non-veg" -> System.out.println("Chicken is available");
                    default -> System.out.println("Choose between veg or Nonv-veg");
                }
                break;

            default:
                System.out.println("Invalid input");

                break;
        }
    }
}

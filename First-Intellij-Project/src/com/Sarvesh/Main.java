package com.Sarvesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("My Name is Sarvesh");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String Name = input.nextLine();
        System.out.println(Name);
    }
}
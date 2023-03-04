package com.Sarvesh;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char letter = sc.next().trim().charAt(0);
        if(letter >= 'a' && letter <= 'z' ){
            System.out.println("Lowercase character");
        }
        else
            System.out.println("Uppercase character");
    }

}

package com.Sarvesh;

import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int res =0;
        char check = '.';
        int num1=0,num2 =0;

            while (check != 'Y') {
                System.out.print("Enter a operation you want to perform (+ , - , / , * , % ) : ");
                char op = sc.next().trim().charAt(0);
                if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers : ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                if (op == '+') {
                    res = num1 + num2;
                } else if (op == '-') {
                    res = num1 - num2;
                } else if (op == '/') {
                    res = num1 / num2;
                } else if (op == '*') {
                    res = num1 * num2;

                } else if (op == '%') {
                    res = num1 % num2;
                } else {
                    System.out.println("Invalid input ");
                    break;
                }

            }
                else {
                    System.out.println("Invalid input");
                    break;
                }
                System.out.println(num1 +""+ op +""+ num2 + " = " + res);
                System.out.println("to exit enter 'Y' else enter 'N' : ");
                check = sc.next().trim().charAt(0);

            }

    }
}

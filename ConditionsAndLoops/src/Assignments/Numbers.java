package Assignments;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input =1;
        while(true)
        {
            System.out.print("Enter a integer or enter 0 to exit :");
            input= sc.nextInt();
                if (input<0) {
                    System.out.println("Negative Number");
                }
                else if  (input>0) {
                    int rem = input % 2;
                    switch (rem) {
                        case 0:
                            System.out.println("Even Number");
                            break;
                        default:
                            System.out.println("Odd Number");
                            break;
                    }
                }
                else if (input == 0)
                    break;
                else
                    System.out.println("Invalid input ");

        }
    }
}

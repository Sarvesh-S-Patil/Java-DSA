package Assignments;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int HCF = 1;
        int large =0;
        if(num1 > num2)
            large = num1;
        else {
            large =num2;
        }

        for(int i =2 ; i <= large; i++){
            if( (num1 %i) ==0 && (num2%i) == 0){
                HCF = i;
            }
        }
        System.out.println("Highest Common Factor between "+num1+" and "+num2+" is "+HCF);
    }
}


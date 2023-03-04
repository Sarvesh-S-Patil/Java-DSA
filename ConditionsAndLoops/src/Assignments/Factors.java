package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int[] FactorsOfN = new int[num];
        int j =0;
        for(int i = 1 ; i <= num/2 ; i++ ){
            if(num%i==0) {
                FactorsOfN[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(FactorsOfN));

    }

}

package com.sarvesh;

import java.util.Arrays;
import java.util.Scanner;

public class VariableArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        marks(50,"Iron","Man");
    }

    static int marks(int v,String ...s) {
        System.out.println(v);
        System.out.println(Arrays.toString(s));
        return 0;
    }
}
package com.sarvesh;

public class Scope {
    static double  pi = 3.14;
    public static void main(String[] args) {
        int marks = 50;
        {

            System.out.println(marks);
            double pi = 56;
            System.out.println(pi);
        }
        marks = 30;
        //uble pi = 56;
        System.out.println(pi);
    }

}

package com.Assignments;
import java.lang.Math;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter your marks out of 100 : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int temp = (int)Math.ceil((marks/10.0));
        System.out.println(temp);
        String res = grade(temp);
        System.out.println(res);

    }

    static String grade(int a){
        String grades = "";
        switch (a){
            case 10:
            {
                grades = "AA";
                break;
            }
            case 9:
            {
                grades ="AB";
                break;
            }
            case 8 :
            {
                grades="BB";
                break;
            }
            case 7 :
            {
                grades="BC";
                break;
            }
            case 6 :
            {
                grades ="CD";
                break;
            }
            case 5 :
            {
                grades = "DD";
                break;
            }
            case 4,3,2,1 : {
                grades = "Fail";
                break;
            }
            default:{
                grades = "Invalid input";
                break;
            }

        }

        return grades;

    }
}




//    <pre>
//            Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail
//</pre>
package com.sarvesh.staticexample;

import com.sarvesh.oops3.access.A;

import java.util.Arrays;

public class SubAccess extends A {
    int temp ;
    SubAccess(int a ,String name ,  int[] arr){
        super(a,name ,arr);
    }

    public static void main(String[] args) {
        int[] arr = {23,360};
        SubAccess Raju = new SubAccess(54,"raju",arr);
        System.out.println(Raju.name);
        System.out.println(Arrays.toString(Raju.getArr()));
        A temp = new A(58,"temp",arr);
        //System.out.println(temp.name);  ---------cannot access becuase parent object cannot access protected things in different package

    }



}

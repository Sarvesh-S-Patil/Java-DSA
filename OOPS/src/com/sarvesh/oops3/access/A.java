package com.sarvesh.oops3.access;

public class A {
    public int a ;
    protected String name;
    private int[] arr;
    public A(int a , String name, int[] arr){
        this.a=a;
        this.name=name;
        this.arr=arr;
    }

    public int[] getArr() {
        return arr;
    }
}

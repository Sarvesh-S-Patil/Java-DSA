package com.sarvesh.oops3.access;


import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,8};
        A Raj = new A(5,"raj",arr);
        System.out.println(Raj.name);
        System.out.println(Arrays.toString(Raj.getArr()));
        A Ramesh = new A(44,"raj",arr);
        System.out.println(Objects.equals(Raj, Ramesh));

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Main() {
        super();
    }

}

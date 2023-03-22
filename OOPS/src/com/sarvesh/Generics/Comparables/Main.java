package com.sarvesh.Generics.Comparables;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Student shantanu = new Student(07,80);
            Student  sarvesh = new Student(44,95);
            Student siddhant = new Student(55,80);
            Student kanishk = new Student(28,85);
            Student[] list= {shantanu,sarvesh,siddhant,kanishk};
            Arrays.sort(list);
            System.out.println(Arrays.toString(list));
    }
}

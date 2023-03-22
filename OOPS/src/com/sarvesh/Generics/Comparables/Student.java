package com.sarvesh.Generics.Comparables;

public class Student implements Comparable<Student> {
    int marks;
    int rollno;
    public Student(int rollno,int marks) {
        this.marks=marks;
        this.rollno=rollno;
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.marks - o.marks;
        return diff;
    }

    @Override
    public String toString() {
        return ("roll no ="+this.rollno+" marks ="+this.marks);
    }
}

package com.sarvesh.oops1;

public class Main {
    public static void main(String[] args){
        Student[] students = new Student[8];
        Student Ram = new Student();

        Ram.rollno = 5;
        Ram.name="Ram";
        Ram.marks=89;

        System.out.println(Ram.marks);
        Student Rakesh = new Student();
        System.out.println(Rakesh.marks);
        Rakesh.greeting();

        Student Kamlesh = new Student(44,"Kamlesh",86);
        System.out.println(Kamlesh.rollno+" "+Kamlesh.name+" "+Kamlesh.marks);
    }


}

class Student{
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello my name is : "+this.name);
    }
    Student(){
        this(10,"Student1",75.0f);
    }
    Student(int rollno,String name , float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

}

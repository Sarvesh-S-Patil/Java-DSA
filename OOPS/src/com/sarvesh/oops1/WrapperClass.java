package com.sarvesh.oops1;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 5;
        int b =7;
        Integer ram =45;
        ram=50;
        System.out.println(ram);
        swap(a,b);
        final int pmarks =80;
        System.out.println(pmarks);
        System.out.println(a+" "+b);
        for(int i =0;i<1000000;i++){
            A student = new A();
        }
    }

    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;

    }

    public static class A{
        String name;
        A(){
            this.name="Preet";
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Destroyed Object");
        }
    }

}

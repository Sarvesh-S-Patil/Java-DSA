package com.sarvesh.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int a = 7;
        int b =0;
        int result;
        try{
            result = divide(a,b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            result = -999;
        }
        finally {
            System.out.println("This will always execute");
        }
        System.out.println(result);
    }
    static int divide(int a, int b){
        return a/b;
    }
}

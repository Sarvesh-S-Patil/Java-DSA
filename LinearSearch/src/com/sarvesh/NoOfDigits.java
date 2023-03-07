package com.sarvesh;

public class NoOfDigits {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(IsEven(num));
        System.out.println(IsEven2(-2535));
    }

    static boolean IsEven(int num) {
        if(noofdigtits(num) % 2 == 0){
            return true;
        }
        return false;
    }

    static int noofdigtits(int num) {
        int count=0;
        if(num<0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        while (num>0){
            count++;
            num /= 10;
        }
        return count;
    }

    static  boolean IsEven2(int num ){

        if(num<0){
            num = num * -1;
        }
        if(num == 0){
            return false;
        }
        int numberofdigits = (int)Math.log10(num)+1;
        System.out.println(numberofdigits);
        if(numberofdigits % 2 == 0){
            return  true;
        }
        return  false;
    }
}



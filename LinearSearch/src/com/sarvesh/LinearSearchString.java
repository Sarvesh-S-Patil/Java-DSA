package com.sarvesh;

import javax.print.DocFlavor;

public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Sarvesh";
        int result = Linear_Search_String(name,'s');
        System.out.println(result);
        System.out.println(Linear_Search_String2(name,'v'));
        System.out.println(Linear_Search_String2(name,'z'));
        System.out.println(Linear_Search_String3(name,'z'));
        System.out.println(Linear_Search_String3(name,'s'));

    }

    static int Linear_Search_String(String input , char target){
        if(input.length() == 0){
            return -1;
        }
        for (int index =0; index < input.length(); index++){
            if(input.charAt(index)== target){
                return  index;
            }

        }
        return -1;
    }


    static char Linear_Search_String2(String input , char target){
        if(input.length() == 0){
            return '#';
        }
        for (int index =0; index < input.length(); index++){
            if(input.charAt(index)== target){
                return  target;
            }

        }
        return '#';
    }


    static boolean Linear_Search_String3(String input , char target){
        if(input.length() == 0){
            return false;
        }
        for (char check : input.toCharArray()){
            if(check == target){
                return  true;
            }

        }
        return false;
    }

}

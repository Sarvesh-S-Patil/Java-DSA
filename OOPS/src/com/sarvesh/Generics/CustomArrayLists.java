package com.sarvesh.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayLists {
    private static int DEFAULT_SIZE = 10;
    private int[] data;
    int size =0;

    public CustomArrayLists() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();

        }
        data[size++]=num;
    }
    public boolean isfull(){
        return size== data.length;
    }

    public void  resize(){
        int[] temp = new int[data.length*2];
        for (int i =0; i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;

    }

    public int remove(){
        int removed = data[size--];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return  size;
    }

    @Override
    public String toString() {
        return "CustomArrayList :"+ Arrays.toString(data);
    }
}

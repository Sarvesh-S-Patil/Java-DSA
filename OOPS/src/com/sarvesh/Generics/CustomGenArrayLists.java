package com.sarvesh.Generics;

import java.util.Arrays;

public class CustomGenArrayLists<T> {
    private static int DEFAULT_SIZE = 10;
    private Object[] data;
    int size =0;

    public CustomGenArrayLists() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isfull()){
            resize();

        }
        data[size++]=num;
    }
    public boolean isfull(){
        return size== data.length;
    }

    public void  resize(){
        Object[] temp = new Object[data.length*2];
        for (int i =0; i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;

    }

    public T remove(){
        T removed = (T)data[size--];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return  size;
    }

    @Override
    public String toString() {
        return "CustomArrayList :"+ Arrays.toString(data);
    }

}

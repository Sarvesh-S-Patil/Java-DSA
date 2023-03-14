package com.sarvesh.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
        this.cost = -1;
    }

    BoxPrice(double cost){
        this.cost=cost;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    BoxPrice(double l , double w, double h,double weight, double cost ){
        super(h,w,l,weight);
        this.cost = cost;
    }
}

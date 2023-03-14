package com.sarvesh.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        this.weight =-1;
    }

    BoxWeight(double l,double h , double w){
        super(l,w,h);
        this.weight =-1;
    }

    BoxWeight(double l,double h, double w , double weight){
        super(l,w,h);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
    }
}

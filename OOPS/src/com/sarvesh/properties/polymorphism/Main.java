package com.sarvesh.properties.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Shapes quad = new Square();
        quad.area();

        triangle.area();
    }
}

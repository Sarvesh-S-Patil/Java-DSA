package com.sarvesh.interfaces.multipleInheritance;

public class Main {
    public static void main(String[] args) {
        gadget Mi = new SmartTV();
        Mi.channel();
        gadget LG = new TV();
        LG.channel();
    }
}

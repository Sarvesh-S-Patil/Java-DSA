package com.sarvesh.collections;

import java.util.List;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(55);
        vector.add(78);
        System.out.println(vector);


        enum Week {
            Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        }

        Week week;
        week = Week.Friday;
        System.out.println(week);
    }
}

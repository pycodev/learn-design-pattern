package me.pycode.learn._8.TamplatePatterninJava;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("d1",4),
            new Duck("d2",2),
            new Duck("d3",8),
            new Duck("d4",5),
        };
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("after sorting -------------");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}

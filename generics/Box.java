package com.teamtreehouse;

/*
    * Box has a generic for type. T will represent the type of Object
    * If there was a type Food that it need to extend, could write
    * public class Box<T extends Food>
    * to limit T to Food objects
*/

public class Box<T> {
    private T contents;

    void add(T thing) {
        if (contents == null) {
            contents = thing;
        }   else {
            System.out.println("The box is full.");
        }
    }

    T remove() {
        if (contents == null) {
            System.out.println("The box is empty.");
            return null;
        }   else {
            T thing = contents;
            contents = null;
            return thing;
        }
    }
}

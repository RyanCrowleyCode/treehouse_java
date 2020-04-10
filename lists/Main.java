package com.teamtreehouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
            * List is an interface, we can't instantiate it.
            * We instead need to use a class that implements List.
            * We will almost always use ArrayList for this.
            *
            * NOTE Also that because we are using the <String> generic on the
            * left side of the assignment, we can shorthand with <> on the right
            * side.
        */
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Jerome");
        groceryLine.add("Beth");
        groceryLine.add("Sam");

        System.out.println(groceryLine);


        groceryLine.remove(1);

        System.out.println(groceryLine);

        String jerome = groceryLine.get(0);
        System.out.println(jerome);

        /*
            * This will git you the index of whatever you pass in to indexOf.
            * If something is not in the list, indexOf returns -1.
            * indexOf starts at the beginning of the list and returns the index
            * of the FIRST appearance of the argument
         */
        int samIndex = groceryLine.indexOf("Sam");
        System.out.println(samIndex);

        // Lists use size() instead of length
        System.out.println(groceryLine.size());

        for (String name : groceryLine) {
            System.out.println(name);
        }

    }
}

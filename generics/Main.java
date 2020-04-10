package com.teamtreehouse;

public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        // Adding Generics to Box to say what Type Box requires
        Box<Milk> boxOfMilk = new Box<>();
        Box<Oranges> boxOfOranges = new Box<>();

        boxOfMilk.add(milk);
        boxOfOranges.add(oranges);

//        debugAdd(milk, boxOfMilk);
//        debugAdd(oranges, boxOfOranges);

        boxOfMilk.remove().drink();

        boxOfOranges.remove().juggle();
    }

    static <T>void debugAdd(T item, Box<T> box) {
        System.out.println("Type: " + item.getClass().getSimpleName());
        box.add(item);
    }
}

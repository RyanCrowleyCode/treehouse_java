package com.teamtreehouse;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("bark");
        Dog dog2 = new Dog("bark");
        Dog dog3 = new Dog("woof");
        System.out.println(dog1.equals(dog2)); // true because sound is same
        System.out.println(dog1.equals(dog3)); // false because sound is different
    }
}

abstract class Animal {
    String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    abstract void findFood();

    void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": sound = " + sound;
    }

    @Override
    public boolean equals(Object o) {
        /*
            * Method is overriding the Object boolean method to instead check
            * for equality based on whether the sound property is equal. This
            * is only if the class is the same, like Dog and Dog, otherwise it
            * returns false before checking the equality of sound.
        */
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        /*
         * Method is overriding the Object hasCode method to instead return
         * the hash code of the sound property.
         */
        return Objects.hash(sound);
    }
}

class Dog extends Animal {
    @Override
    void findFood() {
        System.out.println("*looks at human*");
        makeSound();
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("*wags tail*");
    }

    Dog(String sound) {
        super(sound);
    }
}

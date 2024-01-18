package org.rd.lessons.lesson11.Interfaces.multiInheritance;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.walk();
        duck.swim();

        Fish fish = new Fish();
        fish.walk();
        fish.swim();

        Crocodile crocodile = new Crocodile();
        crocodile.walk();
        crocodile.swim();
    }
}

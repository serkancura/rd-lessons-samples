package org.rd.lessons.lesson11.Interfaces.multiInheritance;

public class Crocodile implements Walkable, Swimmable{

    @Override
    public void walk() {
        System.out.println("Crocodile is walking.");
    }

    @Override
    public void swim() {
        System.out.println("Crocodile is swimming.");
    }
}

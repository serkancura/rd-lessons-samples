package org.rd.lessons.lesson11.Interfaces.multiInheritance;

public class Fish implements Walkable, Swimmable {

    @Override
    public void walk() {
        System.out.println("Fish isn't walking.");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

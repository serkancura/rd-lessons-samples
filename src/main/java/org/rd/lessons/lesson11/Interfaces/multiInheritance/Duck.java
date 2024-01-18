package org.rd.lessons.lesson11.Interfaces.multiInheritance;

public class Duck implements Walkable, Swimmable {
    @Override
    public void walk() {
        System.out.println("Duck is walking.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

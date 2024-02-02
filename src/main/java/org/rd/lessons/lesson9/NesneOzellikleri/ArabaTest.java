package org.rd.lessons.lesson9.NesneOzellikleri;

public class ArabaTest {

    public static void main(String[] args) {
        Araba araba1 = new Araba();

        araba1.setModel("Renault");
        araba1.setYil(2023);


        System.out.println("1. Araba modeli: "+ araba1.getModel());
        System.out.println("1. Araba yili: "+ araba1.getYil());

        System.out.println("---------------------------");

        Araba araba2 = new Araba("Toyota",2022);

        System.out.println("2. Araba modeli: "+ araba2.getModel());
        System.out.println("2. Araba yili: "+ araba2.getYil());
    }
}

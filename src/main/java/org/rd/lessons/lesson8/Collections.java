package org.rd.lessons.lesson8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {


        List<String> liste = new ArrayList<>();
        ArrayList<String> arrayListe = new ArrayList<>();

        liste.add("Kırmızı");
        liste.add("Mavi");
        liste.add(2,"Beyaz");
        liste.add(3,"Sarı");
        liste.set(2,"Mor");

        System.out.println(liste.get(2) + liste.get(3));


        LinkedList<String> linkedList =  new LinkedList<>();

        linkedList.add("Armut");
        linkedList.add("Elma");

        System.out.println(linkedList.get(0));


        HashSet<String> sets = new HashSet<>();
    }
}

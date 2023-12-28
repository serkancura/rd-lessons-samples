package org.rd.lessons.lesson7;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Loop4 {

    public static void main(String[] args) {
         int aranan=13;

        List<Integer> dizi = new ArrayList<>();

        for(int i=0; i<=100; i++){
            dizi.add(i);
        }

        for (int eleman : dizi) {
            System.out.println("Eleman= "+ eleman);

            if (eleman == aranan) {
                System.out.println("Eleman bulundu: " + aranan);
                return;
            }
            System.out.println("Döngü Sonlandı!" + eleman);
        }

    }
}

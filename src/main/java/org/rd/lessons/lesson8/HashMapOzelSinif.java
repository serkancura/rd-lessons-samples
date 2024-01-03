package org.rd.lessons.lesson8;

import java.util.HashMap;

public class HashMapOzelSinif {
    public static void main(String[] args) {

        HashMap<Integer, Ogrenci> ogrenciMAp =  new HashMap<>();

        ogrenciMAp.put(1,new Ogrenci("Ali", 20));
        ogrenciMAp.put(2,new Ogrenci("Ayşe", 19));
        ogrenciMAp.put(3,new Ogrenci("Ahmet", 27));


        Ogrenci ali = ogrenciMAp.get(1);

        System.out.println("1 numralı öğrencimizin adı: "+ ali.ad + " yaşı: "+ ali.yas);


        for (int numara : ogrenciMAp.keySet()){
            Ogrenci ogr = ogrenciMAp.get(numara);
            System.out.println(numara +" -> " +ogr.ad + ", " + ogr.yas + " yaşında!");
        }

    }
}

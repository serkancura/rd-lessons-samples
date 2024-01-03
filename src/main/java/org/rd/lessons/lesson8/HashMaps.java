package org.rd.lessons.lesson8;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {


        HashMap<String, String> renkler = new HashMap<>();

        renkler.put("R","Red");
        renkler.put("B","Blue");
        renkler.put("W","White");
        renkler.put("Y","Yellow");


        System.out.println(renkler.get("R"));
    }
}

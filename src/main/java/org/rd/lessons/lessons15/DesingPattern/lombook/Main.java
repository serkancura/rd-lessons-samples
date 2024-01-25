package org.rd.lessons.lessons15.DesingPattern.lombook;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Bilgisayar bilgisayar = Bilgisayar.builder()
                .marka("Casper")
                .islemci("İntel")
                .ram(16)
                .depolama(500)
                .build();


        System.out.println(bilgisayar);
    }
}

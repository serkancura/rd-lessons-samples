package org.rd.lessons.lesson15.DesingPattern.lombook;

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

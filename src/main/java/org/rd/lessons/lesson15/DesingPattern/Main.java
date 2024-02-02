package org.rd.lessons.lesson15.DesingPattern;

public class Main {
    public static void main(String[] args) {
        Bilgisayar bilgisayar = Bilgisayar.BilgisayarBuilder.aBilgisayar()
                .withMarka("Casper")
                .withIslemci("İntel")
                .withRam(16)
                .withDepolama(500)
                .build();


        System.out.println(bilgisayar);
    }
}

package org.rd.lessons.lesson11.Abstraction;

public class Kare extends Sekil{
    private int kenar;

    public Kare(int kenar){
        this.kenar = kenar;
    }

    @Override
    void cevreHesapla() {
        System.out.println("Karenin çevresi: "+ (4 * (kenar)));
    }

    @Override
    void alanHesapla() {
        System.out.println("Karenin alanı: "+ (kenar*kenar));
    }
}

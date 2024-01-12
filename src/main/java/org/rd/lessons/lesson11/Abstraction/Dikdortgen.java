package org.rd.lessons.lesson11.Abstraction;

public class Dikdortgen extends Sekil {
    private int en;
    private int boy;

    public Dikdortgen(int en, int boy){
        this.en = en;
        this.boy = boy;
    }

    @Override
    void cevreHesapla() {
        System.out.println("Dikdörtgenin çevresi: "+ (2 * (en + boy)));
    }

    @Override
    void alanHesapla() {
        System.out.println("Dikdörtgenin alanı: "+ (en * boy));
    }
}

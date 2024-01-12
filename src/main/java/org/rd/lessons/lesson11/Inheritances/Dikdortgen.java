package org.rd.lessons.lesson11.Inheritances;

public class Dikdortgen extends Sekil {
    private int en;
    private int boy;

    public Dikdortgen(int en, int boy, int x, int y){
        super(x, y);
        this.en = en;
        this.boy = boy;
    }

    public void alanHesapla() {
        System.out.println("Dikdörtgenin alanı: "+ (en * boy));
    }
}

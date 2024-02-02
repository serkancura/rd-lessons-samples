package org.rd.lessons.lesson8;

public class Ogrenci {
    String ad;
    int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Ogrenci(String ad, int yas){
        this.ad = ad;
        this.yas =  yas;
    }
}

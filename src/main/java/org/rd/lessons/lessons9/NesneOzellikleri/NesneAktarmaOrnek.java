package org.rd.lessons.lessons9.NesneOzellikleri;

import org.rd.lessons.lesson8.Ogrenci;

public class NesneAktarmaOrnek {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci("Ahmet", 20);

        System.out.println("Orijinal öğrenci bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());

        degisiklikYap(ogrenci);

    }

    public static void degisiklikYap(Ogrenci ogrenci) {
        ogrenci.setAd("Mehmet");
        ogrenci.setYas(22);

        System.out.println("Metot içerisindeki öğrenci bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());
    }
}

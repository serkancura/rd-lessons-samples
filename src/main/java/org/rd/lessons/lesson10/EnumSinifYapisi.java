package org.rd.lessons.lesson10;

public class EnumSinifYapisi {
    public static void main(String[] args) {
        HaftaGunleri bugun = HaftaGunleri.PERSEMBE;

        System.out.println("Bugün : " + bugun);
        System.out.println("Gün numarası: " + bugun.getGunNo());
        System.out.println("Günün durumu: " + bugun.isHaftaIci());

        HaftaGunleri secilenGun = HaftaGunleri.PAZAR;

        System.out.println("Seçilen Gün : " + bugun);
        System.out.println("Seçilen Gün numarası: " + secilenGun.getGunNo());
        System.out.println("Seçilen Günün durumu: " + secilenGun.isHaftaIci());
    }
}

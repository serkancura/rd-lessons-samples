package org.rd.lessons.lesson10;

public class EnumDonusturme {
    public static void main(String[] args) {

        String donusturulenGun = HaftaGunleri.PAZARTESI.name();
        int gunValue = HaftaGunleri.PAZARTESI.getGunNo();

        System.out.println(donusturulenGun.toLowerCase());


        String gun = "SALI";
        HaftaGunleri guneDonustur = HaftaGunleri.valueOf(gun);
        System.out.println("Haftanın günü: "+ guneDonustur);
    }
}

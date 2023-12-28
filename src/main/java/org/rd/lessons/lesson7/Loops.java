package org.rd.lessons.lesson7;

public class Loops {

    public static void main(String[] args) {

        System.out.println(" For döngüsü: ");

        for (int i = 1; i <= 10; i += 2) {

            System.out.println("i = " + i);
        }

        System.out.println(" For-each döngüsü: ");

        int[] sayilar = {1, 2, 3, 4, 5};

        for (int sayi : sayilar) {
            sayi = sayi - 1;
            System.out.println("sayı = " + sayi);
        }

        System.out.println(" While döngüsü: ");

        int sayac = 1;
        while (sayac <= 5) {
            System.out.println("Yenileme:  "+sayac);
            sayac++;
        }


        System.out.println(" While döngüsü: ");

        int sayac1 = 1;
        do {
            System.out.println("Sonlu yenimeleme: "+ sayac1);
            sayac1++;

        } while (sayac1 <= 5);
    }
}

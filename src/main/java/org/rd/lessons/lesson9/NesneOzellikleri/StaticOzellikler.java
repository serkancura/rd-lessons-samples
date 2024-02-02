package org.rd.lessons.lesson9.NesneOzellikleri;

public class StaticOzellikler {

    public static final double PI = 3.14;

    public static int sayac = 0;

    public  int instanceSayac =0;

    public StaticOzellikler() {
        sayac++;
        instanceSayac++;
    }


    public static void main(String[] args) {

        System.out.println("PI sayısı: "+ StaticOzellikler.PI);

        StaticOzellikler nesne1 = new StaticOzellikler();
        System.out.println("Sayaç: "+ StaticOzellikler.sayac);
        System.out.println("InstanceSayac: " + nesne1.instanceSayac);


        StaticOzellikler nesne2 = new StaticOzellikler();
        System.out.println("Sayaç: "+ nesne2.sayac);
        System.out.println("InstanceSayac: "+ nesne2.instanceSayac);


        StaticOzellikler nesne3 = new StaticOzellikler();
        System.out.println("Sayaç: "+ nesne3.sayac);
        System.out.println("InstanceSayac: "+ nesne3.instanceSayac);


    }
}

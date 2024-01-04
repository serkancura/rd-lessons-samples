package org.rd.lessons.lesson10;

public class HaftaKontrolu {


    public static void main(String[] args) {
        EnumOrnek.Gunler gun = EnumOrnek.Gunler.PERSEMBE;

        switch (gun) {
            case CUMA:
                System.out.println("Bugün günlerden Cuma");
                break;
            case CUMARTESI:
                System.out.println("Bugün günlerden Cumartesi");
                break;
            case PAZAR:
                System.out.println("Bugün günlerden Pazar");
                break;
            case PAZARTESI:
                System.out.println("Bugün günlerden Pazartesi");
                break;
            case SALI:
                System.out.println("Bugün günlerden Salı");
                break;
            case CARSAMBA:
                System.out.println("Bugün günlerden Çarşamba");
                break;
            case PERSEMBE:
                System.out.println("Bugün günlerden Perşembe");
                break;
        }
    }
}

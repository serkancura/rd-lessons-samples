package org.rd.lessons.lesson7;

public class Loop3 {

    public static void main(String[] args) {
       int bolunen = 10;
       int bolum;

        for (int eleman = 0; eleman <= 5; eleman++) {

            if (eleman == 0) {
                System.out.println("Eleman 0 olamaz: " + eleman);
                continue;
            }
            bolum = bolunen / eleman;

            System.out.println("Yenileme: " + bolum);
        }
    }
}

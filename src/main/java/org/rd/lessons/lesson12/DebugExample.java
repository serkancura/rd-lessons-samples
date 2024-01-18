package org.rd.lessons.lesson12;

public class DebugExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Dizideki elemanların toplamını hesaplayalım
        for (int i = 0; i <= numbers.length; i++) { // Mantıksal hata: <= yerine < olmalı
            sum += numbers[i];
        }

        System.out.println("Dizideki elemanların toplamı: " + sum);
    }
}

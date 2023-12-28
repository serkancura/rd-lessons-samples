package org.rd.lessons.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Loop5 {

    public static void main(String[] args) {

        int[] sayiList = {10, 6, 8, 5, 23, 65, 1};

        for (int i = 0; i < sayiList.length-1; i++) {
            for (int j = i+1; j < sayiList.length ; j++) {
                if (sayiList[i] > sayiList[j]) {
                    int gecici = sayiList[i];
                    sayiList[i] = sayiList[j];
                    sayiList[j] = gecici;
                }
            }
        }
        for (int sayi : sayiList) {
            System.out.println(sayi);
        }
    }
}

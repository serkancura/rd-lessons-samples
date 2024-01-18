package org.rd.lessons.lesson13.samplesWithFileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/org/rd/lessons/lesson13/samplesWithFileStream/dosya.txt");
            int veri;

            while ((veri = fis.read()) != -1) {
                System.out.println(veri);
                System.out.println((char) veri);
                System.out.println("---");
            }

        } catch (FileNotFoundException ex) {
            System.out.println(" Dosya bulunamadı. Hata: " + ex.getMessage() + " ,Detay  " + ex.getStackTrace());
        }

    }
}

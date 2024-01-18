package org.rd.lessons.lesson13.samplesWithFileStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/org/rd/lessons/lesson13/samplesWithFileStream/aa.txt");

            String veri = "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";

            byte[] bytes =  veri.getBytes();

            fos.write(bytes);
            System.out.println("Dosyaya yazıldı!");
        } catch (IOException e) {
            System.out.println("Dosya yazılamadı! Hata: "+ e.getMessage() + ", Detay:  " + Arrays.toString(e.getStackTrace()));
        }


    }

}

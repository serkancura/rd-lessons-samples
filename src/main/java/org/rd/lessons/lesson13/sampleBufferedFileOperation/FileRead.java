package org.rd.lessons.lesson13.sampleBufferedFileOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/org/rd/lessons/lesson13/sampleBufferedFileOperation/test.txt"));
            String line;

            while (( line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(" Dosya okunamadı! Hata: " + e.getMessage());
        }

    }
}

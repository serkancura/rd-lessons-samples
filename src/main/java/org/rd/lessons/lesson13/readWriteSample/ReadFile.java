package org.rd.lessons.lesson13.readWriteSample;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

    //dosyadan bir satır okur ve sonucu döndürü
    public static String readLine() {

        String str = null;
        try {
            FileClass fileClass = new FileClass();

            FileInputStream fileStream = new FileInputStream(fileClass.getFilename());
            DataInputStream dataInputStream = new DataInputStream(fileStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));

            str = bufferedReader.readLine();

            dataInputStream.close();
        } catch (Exception e) {
            System.err.println("Hata " + e.getMessage());
        }
        return str;
    }

    public static void splitLine(String splitter) {
        FileClass fileClass2 = new FileClass();

        String str = "";
        StringBuilder allLines = new StringBuilder();

        try {
            FileInputStream fileStream = new FileInputStream(fileClass2.getFilename());
            DataInputStream dataInputStream = new DataInputStream(fileStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));

            while ((str = bufferedReader.readLine()) != null)

                allLines.append(str);

            dataInputStream.close();
        } catch (Exception e) {
            System.err.println("Hata " + e.getMessage());
        }

        String[] splittedLine = allLines.toString().split(splitter);

        for (String s : splittedLine) {
            System.out.println(s);
        }
    }


}
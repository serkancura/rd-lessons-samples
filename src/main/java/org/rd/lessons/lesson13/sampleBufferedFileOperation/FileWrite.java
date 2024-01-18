package org.rd.lessons.lesson13.sampleBufferedFileOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {

        try(BufferedWriter bfw = new BufferedWriter (
                    new FileWriter( "src/main/java/org/rd/lessons/lesson13/sampleBufferedFileOperation/yazilanTest.txt"))) {
            String veri = """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit.\s
                     Aenean eleifend nisl volutpat, condimentum felis sed, ultrices est.\s
                     Aenean in egestas sapien. Phasellus neque erat, egestas a aliquam nec,
                     cursus eu arcu. Morbi et sapien pellentesque, tempor ipsum vel, tempus odio. Donec vel lacus dictum, finibus nunc eu, vulputate nibh. Pellentesque faucibus lacus a risus fringilla,""";


            bfw.write(veri);

            System.out.println("Dosya yazıldı!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

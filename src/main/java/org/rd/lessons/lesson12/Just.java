package org.rd.lessons.lesson12;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Just {
    public static void main(String[] args) throws Exception {
        //Reading data from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String data = sc.nextLine();
        byte[] buf = data.getBytes();
        //Writing it to a file using the DataOutputStream
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/java/org/rd/lessons/lesson12/data.txt"));
        for (byte b:buf) {
            dos.writeChar(b);
        }
        dos.flush();
        //Reading from the above created file using readChar() method
        DataInputStream dis = new DataInputStream(new FileInputStream("src/main/java/org/rd/lessons/lesson12/data.txt"));
        while(true) {
            char ch;
            try {
                ch = dis.readChar();
                System.out.print(ch);
            } catch (EOFException e) {
                System.out.println("");
                System.out.println("End of file reached");
                break;
            } catch (IOException e) {}
        }
    }
}
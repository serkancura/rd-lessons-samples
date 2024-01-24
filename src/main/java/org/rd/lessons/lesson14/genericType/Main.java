package org.rd.lessons.lesson14.genericType;

public class Main {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setContent(10);
        System.out.println(intBox.getContent());


        Box<String> strBox = new Box<>();
        strBox.setContent("Selam");
        System.out.println(strBox.getContent());


        Box<Boolean> boolBox = new Box<>();
        boolBox.setContent(true);
        System.out.println(boolBox.getContent());

    }
}

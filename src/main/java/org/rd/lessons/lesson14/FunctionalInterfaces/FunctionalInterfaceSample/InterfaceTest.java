package org.rd.lessons.lesson14.FunctionalInterfaces.FunctionalInterfaceSample;

public class InterfaceTest {
    public static void main(String[] args) {
        InterfaceOrnek sum = (x,y) -> x+y;
        InterfaceOrnek carp = (x,y) -> x*y;
        InterfaceOrnek bol = (x,y) -> y/x;

        int result = sum.uygula(3,4);
        System.out.println(result);
        int result2 = carp.uygula(3,4);
        System.out.println(result2);
        int result3 = bol.uygula(3,9);
        System.out.println(result3);


    }


}

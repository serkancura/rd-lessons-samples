package org.rd.lessons.lessons9.NesneOzellikleri;

public class StaticMetotOrnek {
    public static void staticMetot(){
        System.out.println("Bu static metotdur");
    }

    public void nonStaticMetot(){
        System.out.println("Static olmayan metot");
    }

    public static void main(String[] args) {
        StaticMetotOrnek.staticMetot();

        StaticMetotOrnek nesne1 = new StaticMetotOrnek();
        nesne1.nonStaticMetot();
    }
}

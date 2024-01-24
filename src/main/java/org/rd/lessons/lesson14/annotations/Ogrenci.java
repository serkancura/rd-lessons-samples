package org.rd.lessons.lesson14.annotations;

public @interface Ogrenci {
    int id();
    String adi();
    String soyadi() default "Cura";
}

package org.rd.lessons.lesson14.annotationsWithRetention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Ogrenci {
    int id();
    String adi();
    String soyadi() default "Cura";
}

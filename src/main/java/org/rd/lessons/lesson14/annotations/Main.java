package org.rd.lessons.lesson14.annotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        RdTestAutomation rdTestAutomation = new RdTestAutomation();

        Class<?> sinif = rdTestAutomation.getClass();
        Annotation[] ekBilgiler = sinif.getAnnotations();

        for(Annotation bilgi: ekBilgiler) {
            System.out.println(bilgi);
        }

        BaseClass baseClass = new BaseClass();

        baseClass.cikar(2,5);

        baseClass.getList();

        Machine machine = new Machine();
        machine.addVersion("test");
    }
}

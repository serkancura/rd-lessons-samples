package org.rd.lessons.lesson14.streams;

import java.util.function.Function;

/*

() -> 3.4
Yukardaki ifade aşağıdaki ifadeye denktir

double getValue() {
    return 3.4;
}


 */
public class Lambda {
    public static void  main(String[] args) {
        Function<Integer, Integer> kareAl = (num) -> num * num;
        System.out.println(kareAl.apply(5)); // Çıktı: 25
    }

//
//    public int kareAlma (int num){
//        return num * num;
//    }
}

package org.rd.lessons.lesson14.FunctionalInterfaces.FunctionSample;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> abs = (sayi) -> Math.abs(sayi);

        int[] numbers = {-1, 0, 1, 2, 3};
        for (int number : numbers) {
            System.out.println(number + " mutlak değeri " + abs.apply(number));
        }
    }
}

package org.rd.lessons.lesson14.FunctionalInterfaces.ConsumerSample;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("serkan", "ahmet", "mehmet");

        Consumer<String> printItem = item -> System.out.println(item);
        list.forEach(printItem);

    }
}


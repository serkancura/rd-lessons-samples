package org.rd.lessons.lesson14.annotations;

import java.util.ArrayList;
import java.util.List;

public class BaseClass {

    public int topla(int a, int b){
        return a+b;
    }

    @Deprecated
    public int cikar(int a, int b) {
        return b-a;
    }

    @SuppressWarnings("checked")
    public List<String> getList(){
        List<String> test = new ArrayList<>();
        test.add("Test");
        return test;
    }
}

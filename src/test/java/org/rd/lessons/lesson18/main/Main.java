package org.rd.lessons.lesson18.main;

public class Main {

/*    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.rd.lessons.lesson18.CustomerTest");
    }*/


    public static void main(String[] args) {
        org.testng.TestNG.main(new String[]{"-d", "target/test-classes", "org.rd.lessons.lesson18.CustomerTestNG"});
    }

}


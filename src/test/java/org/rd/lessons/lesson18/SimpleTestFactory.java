package org.rd.lessons.lesson18;

import org.testng.annotations.Factory;

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleTest(0), new SimpleTest(1) , new SimpleTest(3)};
    }
}

package org.rd.lessons.lesson18;

import org.junit.*;
import org.rd.lessons.lesson18.junitTestNg.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer = new Customer();
    @Before
    public void before(){

        customer.setFirstname("John");
        customer.setEmail("john@doe.com");
    }

    @Test
    public void testCustomerName() {
        assertEquals("John", customer.getFirstname());
    }

    @Test
    public void tetCustomerEmail() {
        assertEquals("john@doe.com", customer.getEmail());
    }

    @After
    public void tearDown(){

    }
}

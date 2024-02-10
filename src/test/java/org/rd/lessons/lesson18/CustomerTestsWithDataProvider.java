package org.rd.lessons.lesson18;

import org.rd.lessons.lesson18.junitTestNg.Customer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CustomerTestsWithDataProvider {

    @Test(groups = "unit", dataProvider = "credentials")
    public void testCustomer(String firstname, String response){
        Customer customer = new Customer(firstname);

        assertEquals(customer.getFirstname(), response );
    }
    @DataProvider(name = "credentials")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"johndoe", "johndoe"},
                {"janedoe", "johndoe"},
                {"johnnydoe", "johndoe"}
        };
    }

}

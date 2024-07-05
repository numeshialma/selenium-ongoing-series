package Session_44_TestNG_Dependency_Methods_Grouping_Tests.test_02;

import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1, groups = {"sanity","regression"} )
    void paymentInRupees(){
        System.out.println("Payment in rupees..");
    }

    @Test(priority = 2, groups = {"sanity","regression"} )
    void paymentInDollars(){
        System.out.println("Payment in dollars..");
    }

}

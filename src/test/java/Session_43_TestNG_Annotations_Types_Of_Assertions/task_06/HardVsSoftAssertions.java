package Session_43_TestNG_Annotations_Types_Of_Assertions.task_06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

    // @Test
    void test_hardAssertions(){
        System.out.println("testing.....");
        System.out.println("testing.....");

        Assert.assertEquals(1,2);

        System.out.println("testing.....");
        System.out.println("testing.....");

    }

    @Test
    void test_softAssertions(){
        System.out.println("testing.....");
        System.out.println("testing.....");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1,2);

        System.out.println("testing.....");
        System.out.println("testing.....");

        sa.assertAll();   // mandatory

    }
}

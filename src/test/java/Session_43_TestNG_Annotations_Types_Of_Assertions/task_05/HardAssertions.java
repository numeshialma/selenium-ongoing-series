package Session_43_TestNG_Annotations_Types_Of_Assertions.task_05;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    void test(){
        // Assert.assertEquals("xyz","xyz");
        // Assert.assertEquals(123,345);
        // Assert.assertEquals("xyz",123);
        // Assert.assertEquals("123",123);

       // Assert.assertNotEquals(123,123);   // failed
      //  Assert.assertNotEquals(123,3345);   // passed

      //  Assert.assertTrue(true);   // passed
      //  Assert.assertTrue(false);   // failed

       // Assert.assertTrue(1==2);   // failed
      //  Assert.assertTrue(1==1);   // passed

      //  Assert.assertFalse(1==2);  // passed
      //  Assert.assertFalse(1==1);  // failed

        Assert.fail();  // if blindly want to fail my test method

    }
}

package Session_43_TestNG_Annotations_Types_Of_Assertions.task_04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo4 {

    @Test
    void testTitle(){
        String exp_title="Opencart";
        String act_title="Openshop";

        if(exp_title.equals(act_title)){
            System.out.println("test passed");
            Assert.assertTrue(true);
        } else {
            System.out.println("test failed");
            Assert.assertTrue(false);
        }

    }
}

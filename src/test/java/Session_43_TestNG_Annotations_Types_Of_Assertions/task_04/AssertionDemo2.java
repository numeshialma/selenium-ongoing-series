package Session_43_TestNG_Annotations_Types_Of_Assertions.task_04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo2 {

    @Test
    void testTitle(){
        String exp_title="Opencart";
        String act_title="Openshop";

        Assert.assertEquals(exp_title,act_title);

    }
}

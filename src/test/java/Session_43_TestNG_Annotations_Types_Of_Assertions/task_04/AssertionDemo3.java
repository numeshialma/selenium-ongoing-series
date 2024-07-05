package Session_43_TestNG_Annotations_Types_Of_Assertions.task_04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo3 {

    @Test
    void testTitle(){
        String exp_title="Opencart";
        String act_title="Opencart";

        Assert.assertEquals(exp_title,act_title);

    }
}

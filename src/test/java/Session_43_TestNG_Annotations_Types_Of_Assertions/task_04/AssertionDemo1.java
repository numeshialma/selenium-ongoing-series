package Session_43_TestNG_Annotations_Types_Of_Assertions.task_04;

import org.testng.annotations.Test;

public class AssertionDemo1 {

    @Test
    void testTitle(){
        String exp_title="Opencart";
        String act_title="Openshop";

        if(exp_title.equals(act_title)){
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

    }
}
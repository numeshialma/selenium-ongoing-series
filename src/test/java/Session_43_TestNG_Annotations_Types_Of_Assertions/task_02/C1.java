package Session_43_TestNG_Annotations_Types_Of_Assertions.task_02;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

    @Test
    void abc() {
        System.out.println("This is abc from C1..");
    }

    @BeforeTest
    void bt() {
        System.out.println("This is before test method..");
    }
}

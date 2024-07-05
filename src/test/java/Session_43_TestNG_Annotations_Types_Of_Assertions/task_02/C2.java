package Session_43_TestNG_Annotations_Types_Of_Assertions.task_02;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

    @Test
    void xyz() {
        System.out.println("This is xyz from C2..");
    }

    @AfterTest
    void at() {
        System.out.println("This is after test method..");
    }
}

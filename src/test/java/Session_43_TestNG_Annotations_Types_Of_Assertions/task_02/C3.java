package Session_43_TestNG_Annotations_Types_Of_Assertions.task_02;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

    @Test
    void pqr() {
        System.out.println("This is pqr from C3..");
    }

    @BeforeSuite
    void bs() {
        System.out.println("This is before suite method..");
    }

    @AfterSuite
    void as() {
        System.out.println("This is after suite method..");
    }
}
package Session_43_TestNG_Annotations_Types_Of_Assertions.task_03;

import org.testng.annotations.*;

public class AllAnnotations {

    @BeforeSuite
    void bs(){
        System.out.println("Before Suite...");
    }

    @AfterSuite
    void as(){
        System.out.println("After Suite...");
    }

    @BeforeTest
    void bt(){
        System.out.println("Before Test...");
    }

    @AfterTest
    void at(){
        System.out.println("After Test...");
    }

    @BeforeClass
    void bc(){
        System.out.println("Before Class...");
    }

    @AfterClass
    void ac(){
        System.out.println("After Class...");
    }

    @BeforeMethod
    void bm(){
        System.out.println("Before Method...");
    }

    @AfterMethod
    void am(){
        System.out.println("After Method...");
    }

    @Test(priority = 1)
    void tm1(){
        System.out.println("Test Method 1...");
    }

    @Test(priority = 2)
    void tm2(){
        System.out.println("Test Method 2...");
    }
}

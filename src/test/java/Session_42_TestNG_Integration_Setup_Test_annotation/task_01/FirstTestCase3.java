package Session_42_TestNG_Integration_Setup_Test_annotation.task_01;

import org.testng.annotations.Test;

/*
    1) Open App
    2) Login
    3) Logout
 */
public class FirstTestCase3 {

    @Test(priority = 1)
    void openapp(){
        System.out.println("opening application....");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("login to application....");
    }

    @Test(priority = 1)
    void logout(){
        System.out.println("logout from application...");
    }

}

package Session_44_TestNG_Dependency_Methods_Grouping_Tests.test_03;

import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1, groups = {"sanity"} )
    void loginByEmail(){
        System.out.println("Login by email..");
    }

    @Test(priority = 2, groups = {"sanity"} )
    void loginByFacebook(){
        System.out.println("Login by facebook..");
    }

    @Test(priority = 3, groups = {"sanity"} )
    void loginByTwitter(){
        System.out.println("Login by twitter..");
    }

}

package Session_44_TestNG_Dependency_Methods_Grouping_Tests.test_03;

import org.testng.annotations.Test;

public class SignUpTests {

    @Test(priority = 1, groups = {"regression"} )
    void signUpByEmail(){
        System.out.println("SignUp by email..");
    }

    @Test(priority = 2, groups = {"regression"} )
    void signUpByFacebook(){
        System.out.println("SignUp by facebook..");
    }

    @Test(priority = 3, groups = {"regression"} )
    void signUpByTwitter(){
        System.out.println("SignUp by twitter..");
    }

}

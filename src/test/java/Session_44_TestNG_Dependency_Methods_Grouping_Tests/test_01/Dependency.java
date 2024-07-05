package Session_44_TestNG_Dependency_Methods_Grouping_Tests.test_01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

    @Test(priority = 1)
    void openapp(){
        Assert.assertTrue(false);
    }

    @Test(priority = 2, dependsOnMethods = {"openapp"} )
    void login(){
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"login"})
    void search(){
        Assert.assertTrue(true);
    }

    @Test(priority = 4, dependsOnMethods = {"login","search"})
    void adsearch(){
        Assert.assertTrue(true);
    }

    @Test(priority = 5, dependsOnMethods = {"login"})
    void logout(){
        Assert.assertTrue(true);
    }
}

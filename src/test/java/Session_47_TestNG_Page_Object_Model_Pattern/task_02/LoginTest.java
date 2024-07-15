package Session_47_TestNG_Page_Object_Model_Pattern.task_02;

import Session_47_TestNG_Page_Object_Model_Pattern.task_02.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {
        LoginPage lp = new LoginPage(driver);

        lp.setUserName("Admin");
        lp.setPassword("admin123");
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

package Session_28_WebDriver_Methods_Browser_Navigation_Commands.task_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}

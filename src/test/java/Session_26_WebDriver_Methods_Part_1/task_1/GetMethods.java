package Session_26_WebDriver_Methods_Part_1.task_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        /** get() */
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        /** getTitle() */
        System.out.println(driver.getTitle());   // output : OrangeHRM

        /** getCurrentUrl() */
        System.out.println(driver.getCurrentUrl());  // output : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        /** getPageSource() */
        System.out.println(driver.getPageSource());

        /** getWindowHandle()  */
        String windowId = driver.getWindowHandle();
        System.out.println("Window ID : " +windowId);


    }
}

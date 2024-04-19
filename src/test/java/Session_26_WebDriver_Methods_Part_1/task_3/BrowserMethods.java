package Session_26_WebDriver_Methods_Part_1.task_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        driver.findElement(By.linkText("Orange, Inc")).click();
        Thread.sleep(5000);

        /** close()  */
        driver.close();

        /*
        1st page (parent window) closed.
         */


    }
}

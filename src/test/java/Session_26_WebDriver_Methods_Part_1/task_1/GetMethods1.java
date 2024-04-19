package Session_26_WebDriver_Methods_Part_1.task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        driver.findElement(By.linkText("Orange, Inc")).click();  // This will open new browser window

        /** getWindowHandles()  */
        Set<String> windowIDs = driver.getWindowHandles();
        System.out.println(windowIDs);


    }
}

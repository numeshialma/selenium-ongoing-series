package Session_28_WebDriver_Methods_Browser_Navigation_Commands.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowsIDs = driver.getWindowHandles();

        // Approach 1
        List<String> windowList = new ArrayList(windowsIDs);
        String parentId =  windowList.get(0);
        String childId =  windowList.get(1);

        // switch to child window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        // switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());

    }
}

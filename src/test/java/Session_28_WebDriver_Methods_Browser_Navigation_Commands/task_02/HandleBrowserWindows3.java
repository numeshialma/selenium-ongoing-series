package Session_28_WebDriver_Methods_Browser_Navigation_Commands.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowsIDs = driver.getWindowHandles();

        // Approach 2
        for(String winID:windowsIDs){
            String title = driver.switchTo().window(winID).getTitle();

            if(title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }
        }
    }
}

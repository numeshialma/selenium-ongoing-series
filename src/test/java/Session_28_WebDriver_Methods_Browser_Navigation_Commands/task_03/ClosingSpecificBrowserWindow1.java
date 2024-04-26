package Session_28_WebDriver_Methods_Browser_Navigation_Commands.task_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowsIDs = driver.getWindowHandles();

        for(String winId : windowsIDs){
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println();

            if(title.equals("OrangeHRM") || title.equals("ABC")){
                driver.close();
            }
        }
    }
}

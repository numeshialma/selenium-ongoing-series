package Session_39_Handling_Broken_Links_SVG_Elements_Shadow_DOM.task_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleSVGElements4 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts ().implicitlyWait (Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button [normalize-space () = 'Login']")).click();

        // Identify SVG Element
        driver.findElement(By.xpath("//button[@title='Timesheets']//*[name()='svg']")).click();

    }
}

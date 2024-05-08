package Session_30_Handling_Frames_iFrames_Nested_iFrames.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);   // passed frame as a webelement   // switch to frame1

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

        driver.switchTo().defaultContent();  // go back to page

        // Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);   // passed frame as a webelement   // switch to frame2

        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
    }
}

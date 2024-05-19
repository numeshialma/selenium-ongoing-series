package Session_30_Handling_Frames_iFrames_Nested_iFrames.task_03;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames3 {
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

        driver.switchTo().defaultContent();

        // Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");

        // inner iframe - part of frame 3
        driver.switchTo().frame(0);   // switching to frame using index

        WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",rdbutton);

        driver.switchTo().defaultContent();

    }
}
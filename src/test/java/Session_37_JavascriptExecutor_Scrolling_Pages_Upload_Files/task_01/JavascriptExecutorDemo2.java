package Session_37_JavascriptExecutor_Scrolling_Pages_Upload_Files.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");

        WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));

        // passing the text into inputbox - alternate of sendKeys()
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','John')", inputBox);


        // driver.findElement(By.xpath("//input[@id='male']")).click();

        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));

        // clicking on element - alternate of click()
        js.executeScript("arguments[0].click()", radiobtn);

    }
}

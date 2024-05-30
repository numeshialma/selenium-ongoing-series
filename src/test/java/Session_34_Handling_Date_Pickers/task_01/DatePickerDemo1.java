package Session_34_Handling_Date_Pickers.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerDemo1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // switch to frame
        driver.switchTo().frame(0);

        // method 1: using sendkeys()
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");    //mm/dd/yyyy


    }
}

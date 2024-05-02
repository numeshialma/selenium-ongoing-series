package Session_29_Handling_Check_Boxes_Different_Types_of_Alerts.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes_1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        /** 1) select specific checkbox  */
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

    }
}

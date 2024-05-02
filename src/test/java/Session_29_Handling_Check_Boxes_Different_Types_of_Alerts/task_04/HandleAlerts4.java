package Session_29_Handling_Check_Boxes_Different_Types_of_Alerts.task_04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // 3) Prompt alert - input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);

        Alert myAlert = driver.switchTo().alert();
        myAlert.sendKeys("Welcome");
        myAlert.accept();

    }
}

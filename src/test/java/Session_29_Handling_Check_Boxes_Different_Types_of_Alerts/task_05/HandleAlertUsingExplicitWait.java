package Session_29_Handling_Check_Boxes_Different_Types_of_Alerts.task_05;

// Handle alert without using switchTo().alert()
// by using explicit wait

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));  // explicit wait declaration

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());   // capture alert

        System.out.println(myAlert.getText());
        myAlert.accept();

    }
}

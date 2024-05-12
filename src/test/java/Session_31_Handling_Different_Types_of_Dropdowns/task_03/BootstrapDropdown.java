package Session_31_Handling_Different_Types_of_Dropdowns.task_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();  // opens dropdown options

        // 1. Select single option
        driver.findElement(By.xpath("//input[@value='Java]")).click();

    }
}

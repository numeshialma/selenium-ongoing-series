package Session_32_Handling_Auto_suggest_Dropdown_Static_Web_Table.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 2. total number of columns in a table
        int cols = driver.findElements(By.tagName("th")).size();
        System.out.println("Number of rows : " + cols);

    }
}

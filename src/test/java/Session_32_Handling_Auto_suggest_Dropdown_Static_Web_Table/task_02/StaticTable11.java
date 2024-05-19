package Session_32_Handling_Auto_suggest_Dropdown_Static_Web_Table.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable11 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1. total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows : " +rows);

        // 2. total number of columns in a table
        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of rows : " + cols);

        // 6. total price of all the books
        int total = 0;
        for(int r=2; r<=rows; r++){
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total=total+Integer.parseInt(price);
        }

        System.out.println("Total price of the books : " +total);

    }
}
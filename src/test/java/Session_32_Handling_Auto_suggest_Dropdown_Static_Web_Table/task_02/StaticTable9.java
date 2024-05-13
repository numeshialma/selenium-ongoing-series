package Session_32_Handling_Auto_suggest_Dropdown_Static_Web_Table.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable9 {
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

        // 5. Print book names whose author is mukesh
        for(int r=2; r<=rows; r++){
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();

            if(authorName.equals("Mukesh")){
                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(bookName);
            }
        }


    }
}

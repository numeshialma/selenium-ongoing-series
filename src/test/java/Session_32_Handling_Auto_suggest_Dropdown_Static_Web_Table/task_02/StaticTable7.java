package Session_32_Handling_Auto_suggest_Dropdown_Static_Web_Table.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable7 {
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

        // 4. read data from all the rows and columns + header part
        System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
        for(int r=2; r<=rows; r++){
            for (int c=1; c<=cols; c++){
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value+"\t");
            }
            System.out.println();
        }


    }
}

package Session_34_Handling_Date_Pickers.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerDemo3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // switch to frame
        driver.switchTo().frame(0);

        // method 2: using date picker
        // expected data
        String year="2023";
        String month="May";
        String date="20";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();    // opens date picker

        // select month & year
        while(true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year

            if(currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   // previous

        }
        
    }
}

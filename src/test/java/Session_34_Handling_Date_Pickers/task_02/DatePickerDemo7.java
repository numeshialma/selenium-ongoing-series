package Session_34_Handling_Date_Pickers.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo7 {

    // selecting future date
    static void selectFutureDate(WebDriver driver, String year, String month, String date){

        while(true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year

            if(currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();   // Next
        }

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

        for(WebElement dt:allDates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
    }

    // selecting past date
    static void selectPastDate(WebDriver driver, String year, String month, String date){

        while(true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year

            if(currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   // Next
        }

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

        for(WebElement dt:allDates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // switch to frame
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();    // opens date picker

        selectFutureDate(driver,"2025","May","20");
    }
}

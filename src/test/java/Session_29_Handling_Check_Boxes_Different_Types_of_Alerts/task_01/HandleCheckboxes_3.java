package Session_29_Handling_Check_Boxes_Different_Types_of_Alerts.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes_3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        /** 3)  select last 3 checkboxes  */
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        // total number of checkboxes - how many checkboxes you want to click
        // 7-3=4 (starting index)
        for(int i=4; i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }

        // to get number for checkboxes ==> checkbox.size()
    }
}

package Session_29_Handling_Check_Boxes_Different_Types_of_Alerts.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes_5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        /** 5)  unselect checkboxes if they are selected  */
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
/*
        for(WebElement checkbox: checkboxes){
            checkbox.click();   // to select all checkboxes

        }

 */
        for(int i=0; i<3;i++){
            checkboxes.get(i).click();
        }

        Thread.sleep(5000);

        for(int i=0; i<3;i++){
            checkboxes.get(i).click();
        }

    }
}

package Session_35_Mouse_Actions_Action_Vs_Actions.task_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        // switch to frame
        driver.switchTo().frame("iframeResult");

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();  // clears box1
        box1.sendKeys("Welcome");

        // double click action on the button
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();

        // validation : box 2 should contain "Welcome"
        String text = box2.getText();

        System.out.println("Captured value is : "+text);

        if(text.equals("Welcome")){
            System.out.println("Text copied..");
        } else {
            System.out.println("Text not copied properly..");
        }
        
    }
}

package Session_35_Mouse_Actions_Action_Vs_Actions.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);

        // Right click action
        act.contextClick(button).perform();

        // click on copy
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

        Thread.sleep(3000);

        // close alert box
        driver.switchTo().alert().accept();
        
    }
}

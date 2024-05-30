package Session_35_Mouse_Actions_Action_Vs_Actions.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']")).click();
        // nothing will happen

        
    }
}

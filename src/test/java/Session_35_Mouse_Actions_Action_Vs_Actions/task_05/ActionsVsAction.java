package Session_35_Mouse_Actions_Action_Vs_Actions.task_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);

        Action myAction = act.contextClick(button).build();  // building / creating an action and storing into a variable
        myAction.perform();   // we are performing / completing action


    }
}

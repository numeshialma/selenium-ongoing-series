package Session_36_Keyboard_Actions_Sliders_Tabs_Windows.task_03;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsOnException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenTheLinkInNewTab1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        Actions act = new Actions(driver);

        // Control + RegLink
        act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

        // Switching registration page
        List<String> ids = new ArrayList(driver.getWindowHandles());

        // Registration - Child page
        driver.switchTo().window(ids.get(1));  // switch to registration page
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John Kenedy");

        // Home page
        driver.switchTo().window(ids.get(0)); // switch to homepage
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");





    }
}

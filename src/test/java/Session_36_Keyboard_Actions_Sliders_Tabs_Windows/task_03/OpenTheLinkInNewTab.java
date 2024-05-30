package Session_36_Keyboard_Actions_Sliders_Tabs_Windows.task_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

    }
}

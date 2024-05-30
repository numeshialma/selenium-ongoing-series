package Session_36_Keyboard_Actions_Sliders_Tabs_Windows.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");

        Actions act = new Actions(driver);

        // Ctrl + a  --> Select the text
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        // Ctrl + c  --> Copy the text into clipboard
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        // TAB  --> Shift to 2nd box
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        // Ctrl + v  --> Pass the text
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

    }
}

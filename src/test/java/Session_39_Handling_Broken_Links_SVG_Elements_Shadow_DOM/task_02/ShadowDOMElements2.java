package Session_39_Handling_Broken_Links_SVG_Elements_Shadow_DOM.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class ShadowDOMElements2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        // This element is inside single shadow DOM

        driver.findElement(By.cssSelector("#input")).sendKeys("Welcome");

    }

}

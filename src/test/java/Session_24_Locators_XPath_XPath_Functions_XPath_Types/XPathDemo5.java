package Session_24_Locators_XPath_XPath_Functions_XPath_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo5 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // XPath with inner text – inner text()
        boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        System.out.println(displayStatus);

        String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
        System.out.println(value);
    }
}

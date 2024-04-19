package Session_24_Locators_XPath_XPath_Functions_XPath_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo7 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // XPath with start-with
        driver.findElement(By.xpath("//input[start-with(@placeholder,'Sea')]")).sendKeys("T shirts");
    }
}

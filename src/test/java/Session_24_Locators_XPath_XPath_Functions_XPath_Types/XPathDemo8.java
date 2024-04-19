package Session_24_Locators_XPath_XPath_Functions_XPath_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo8 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // Chained XPath
        boolean imagesStatus = driver.findElement(By.xpath("//div[@id=’logo’]/a/img")).isDisplayed();
        System.out.println(imagesStatus);
    }
}

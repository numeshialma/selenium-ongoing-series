package session_22_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        /** name */
        driver.findElement(By.name("search")).sendKeys("Mac");

        /** id */
        boolean logoDisplayedStatus = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoDisplayedStatus);

        /** linkText & partialLinkText */
        driver.findElement(By.linkText("Tablets")).click();   // linkText
        driver.findElement(By.partialLinkText("Tab")).click();  // partialLinkText

        /** className */
        List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        System.out.println("Total number of header links: " +headerLinks.size());
        // output = 7. but there are visible 5 links. then other links are hidden links.

        /** tagName */
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " +links.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images: " +images.size());

    }
}

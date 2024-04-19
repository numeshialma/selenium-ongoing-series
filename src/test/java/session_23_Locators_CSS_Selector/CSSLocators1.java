package session_23_Locators_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");


        /** Maximize the browser window */
        driver.manage().window().maximize();

        // tag class
       // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

        // or
         driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");


    }
}

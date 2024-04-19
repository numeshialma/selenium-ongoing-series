package session_23_Locators_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");


        /** Maximize the browser window */
        driver.manage().window().maximize();

        // tag id
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");

        // or
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");


    }
}

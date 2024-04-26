package Session_23_Locators_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");


        /** Maximize the browser window */
        driver.manage().window().maximize();

        // tag class attribute
        driver.findElement(By.cssSelector("input.search-box-text[name=''q']")).sendKeys("T-shirts");

        driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-shirts");

        // or
        driver.findElement(By.cssSelector(".search-box-text[name=''q']")).sendKeys("T-shirts");


    }
}

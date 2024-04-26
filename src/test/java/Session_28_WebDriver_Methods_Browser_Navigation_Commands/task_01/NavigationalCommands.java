package Session_28_WebDriver_Methods_Browser_Navigation_Commands.task_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

       //  driver.get("https:demo.nopcommerce.com/");

        driver.navigate().to("https://demo.nopcommerce.com/");


    }
}

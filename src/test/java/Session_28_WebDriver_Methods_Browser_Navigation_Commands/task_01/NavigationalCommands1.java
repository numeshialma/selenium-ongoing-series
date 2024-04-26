package Session_28_WebDriver_Methods_Browser_Navigation_Commands.task_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands1 {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();

        URL myUrl = new URL("https://demo.nopcommerce.com/");
        driver.navigate().to(myUrl);

    }
}

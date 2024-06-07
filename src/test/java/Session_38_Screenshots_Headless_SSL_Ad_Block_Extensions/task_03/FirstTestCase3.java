package Session_38_Screenshots_Headless_SSL_Ad_Block_Extensions.task_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstTestCase3 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");  // setting for headless mode of execution

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.opencart.com/");


    }
}

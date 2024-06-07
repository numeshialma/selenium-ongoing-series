package Session_38_Screenshots_Headless_SSL_Ad_Block_Extensions.task_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RunTestsIncognitoMode {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.opencart.com/");


    }
}

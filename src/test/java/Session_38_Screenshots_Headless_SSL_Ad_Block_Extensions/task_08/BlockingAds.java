package Session_38_Screenshots_Headless_SSL_Ad_Block_Extensions.task_08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;


public class BlockingAds {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        File file = new File("C:\\Automation\\automationFiles\\crx files\\uBlock-origin.crx");
        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://text-compare.com/");

    }
}

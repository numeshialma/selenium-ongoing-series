package Session_38_Screenshots_Headless_SSL_Ad_Block_Extensions.task_01;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CaptureScreenshots1 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 1. full page screenshot
        TakesScreenshot screenshot = driver;

    }
}

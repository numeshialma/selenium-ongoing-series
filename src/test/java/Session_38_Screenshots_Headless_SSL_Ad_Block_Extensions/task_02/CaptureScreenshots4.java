package Session_38_Screenshots_Headless_SSL_Ad_Block_Extensions.task_02;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshots4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 3. capture the screenshot of web element
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        File sourceFile = logo.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\screenshot\\featuredProduct.png");

        sourceFile.renameTo(targetFile);  // copy sourceFile to target file


    }
}



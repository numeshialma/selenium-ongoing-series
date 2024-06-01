package Session_37_JavascriptExecutor_Scrolling_Pages_Upload_Files.task_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(5000);
        driver.manage().window().minimize();

        Thread.sleep(5000);
        driver.manage().window().maximize();


    }
}

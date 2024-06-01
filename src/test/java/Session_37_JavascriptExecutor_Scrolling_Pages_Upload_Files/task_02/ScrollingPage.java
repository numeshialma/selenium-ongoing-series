package Session_37_JavascriptExecutor_Scrolling_Pages_Upload_Files.task_02;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Scroll down page by pixel number
        js.executeScript("window.scrollBy(0,15000)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));



    }
}

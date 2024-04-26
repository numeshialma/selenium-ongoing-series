package Session_21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/**
Test case
    1) Launch browser (Chrome)
    2) Open URL https://demo.opencart.com/
    3) Validate title should be "Your Store"
    4) Close browser
*/
public class FirstTestCase1 {
    public static void main(String[] args) {

        /** 1) Launch browser (Chrome)*/
        // ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();   // this is UpCasting

    }
}

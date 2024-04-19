package session_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
Test case
    1) Launch browser (Chrome)
    2) Open URL https://demo.opencart.com/
    3) Validate title should be "Your Store"
    4) Close browser
*/
public class FirstTestCase2 {
    public static void main(String[] args) {

        /** 1) Launch browser (Edge)   */
        WebDriver driver = new EdgeDriver();

        /** 2) Open URL https://demo.opencart.com/  */
        driver.get("https://demo.opencart.com/");

        /** 3) Validate title should be "Your Store"   */
        String actualTitle = driver.getTitle();

        if(actualTitle.equals("Your Store")){
            System.out.println("Test Passed ");
        } else {
            System.out.println("Test Failed ");
        }

        /** 4) Close browser    */
        driver.close();
        // driver.quit()

    }
}

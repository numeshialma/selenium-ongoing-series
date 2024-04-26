package Session_21;

import org.openqa.selenium.chrome.ChromeDriver;

/**
Test case
    1) Launch browser (Chrome)
    2) Open URL https://demo.opencart.com/
    3) Validate title should be "Your Store"
    4) Close browser
*/
public class FirstTestCase {
    public static void main(String[] args) {

        /** 1) Launch browser (Chrome)   */
        ChromeDriver driver = new ChromeDriver();

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

package Session_36_Keyboard_Actions_Sliders_Tabs_Windows.task_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);  // opens new window

        driver.get("https://www.orangehrm.com/");


    }
}

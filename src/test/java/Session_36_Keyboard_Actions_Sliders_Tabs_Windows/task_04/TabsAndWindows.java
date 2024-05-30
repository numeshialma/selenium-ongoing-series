package Session_36_Keyboard_Actions_Sliders_Tabs_Windows.task_04;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class TabsAndWindows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/");

        driver.switchTo().newWindow(WindowType.TAB);  // opens new tab

        driver.get("https://www.orangehrm.com/");


    }
}

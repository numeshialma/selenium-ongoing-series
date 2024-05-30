package Session_36_Keyboard_Actions_Sliders_Tabs_Windows.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SliderDemo1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println("Location of the min slider : " +min_slider.getLocation().getX());  // 59
    }
}
